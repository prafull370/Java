import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int n = sc.nextInt();
        System.out.print("Enter your second number:");
        int m = sc.nextInt();
        // int flag = 0, i;
        int i, j, count;
        for (i = n; i < m; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            count = 1;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Prime number "+ i);

            }
        }
    }
}
