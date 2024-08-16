import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class RootPathSubsets {
    static final int MOD = 1000000007;
    static List<Integer>[] tree;
    static int[] values;
    static int K;
    static long totalSubsets;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of nodes
        int M = sc.nextInt(); // Number of edges

        values = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            values[i] = sc.nextInt(); // Values of nodes
        }
        K = sc.nextInt(); // Desired subset sum

        // Initialize tree
        tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        // Read edges
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }

        totalSubsets = 0;

        // Perform DFS from the root (node 1)
        dfs(1, new boolean[N + 1]);

        System.out.println(totalSubsets % MOD);
    }

    public static void dfs(int node, boolean[] visited) {
        visited[node] = true;

        // List to store all values from root to this node
        List<Integer> pathValues = new ArrayList<>();
        collectPathValues(node, visited, pathValues);

        // Compute the number of subsets with sum K using DP
        totalSubsets += countSubsetsWithSumK(pathValues, K);
        totalSubsets %= MOD;

        // Continue DFS
        for (int neighbor : tree[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    public static void collectPathValues(int node, boolean[] visited, List<Integer> pathValues) {
        // Collect values from the root to the current node
        Stack<Integer> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            int current = stack.pop();
            pathValues.add(values[current]);

            for (int neighbor : tree[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }

    public static long countSubsetsWithSumK(List<Integer> pathValues, int K) {
        int n = pathValues.size();
        long[] dp = new long[K + 1];
        dp[0] = 1; // There's always one way to get a sum of 0 (the empty subset)

        for (int value : pathValues) {
            for (int j = K; j >= value; j--) {
                dp[j] = (dp[j] + dp[j - value]) % MOD;
            }
        }

        return dp[K];
    }
}
