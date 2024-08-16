import java.util.*;

public class GoodArrayPartition {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(findNumberOfWays(A, N));
    }

    public static int findNumberOfWays(int[] A, int N) {
        int[] dp = new int[N + 1];
        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            Set<Integer> seen = new HashSet<>();
            int mex = 0;
            for (int j = i - 1; j >= 0; j--) {
                seen.add(A[j]);
                while (seen.contains(mex)) {
                    mex++;
                }
                if (j == 0 || mex >= calculateMexPrefix(dp, A, j)) {
                    dp[i] = (dp[i] + dp[j]) % MOD;
                }
            }
        }

        return dp[N];
    }

    public static int calculateMexPrefix(int[] dp, int[] A, int j) {
        Set<Integer> prefixSet = new HashSet<>();
        for (int i = 0; i < j; i++) {
            prefixSet.add(A[i]);
        }
        int mexPrefix = 0;
        while (prefixSet.contains(mexPrefix)) {
            mexPrefix++;
        }
        return mexPrefix;
    }
}
