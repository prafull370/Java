import java.util.*;

public class EdgesErasing {
    static int N, M;
    static int[] colors;
    static List<Integer>[] tree;
    static int[] subtreeGCD;
    static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        colors = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            colors[i] = sc.nextInt();
        }

        tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }

        subtreeGCD = new int[N + 1];
        parent = new int[N + 1];
        Arrays.fill(parent, -1);

        computeSubtreeGCD(1, -1);

        int result = countEqualBeautyEdges(1);
        System.out.println(result);
    }

    static void computeSubtreeGCD(int node, int par) {
        subtreeGCD[node] = colors[node];
        parent[node] = par;

        for (int neighbor : tree[node]) {
            if (neighbor != par) {
                computeSubtreeGCD(neighbor, node);
                subtreeGCD[node] = gcd(subtreeGCD[node], subtreeGCD[neighbor]);
            }
        }
    }

    static int countEqualBeautyEdges(int node) {
        int count = 0;

        for (int neighbor : tree[node]) {
            if (neighbor != parent[node]) {
                if (subtreeGCD[neighbor] == subtreeGCD[node]) {
                    count++;
                }
                count += countEqualBeautyEdges(neighbor);
            }
        }

        return count;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
