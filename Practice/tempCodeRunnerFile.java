import java.util.Scanner;

public class GeneralAliGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of soldiers in the enemy army
        System.out.println(minMoves(N));
    }

    public static int minMoves(int N) {
        if (N <= 1) {
            return 0;
        }

        int[] dp = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1; // Move type 1: Reduce by 1 soldier
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // Move type 2: Reduce by half
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // Move type 3: Reduce by two-thirds
            }
        }
        return dp[N];
    }
}
