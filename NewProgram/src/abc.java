public class abc {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 ) System.out.print("* ");
            }
        }
        // middle portion
        System.out.println();
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1) {
                    if (j == 1 || j == n) System.out.print("* ");
                    else System.out.print("  ");
                } else {
                    if (j == 1 || j == n) System.out.print("* ");
                    else if (j % 2 == 0) System.out.print("  ");
                    else System.out.print("* ");

                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n) System.out.print("* ");
            }
        }

    }
}
