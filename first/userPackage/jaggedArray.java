
import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] ags) {
        int r;
        System.out.print("Enter number of rows : ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        int c;
        int[][] arr = new int[r][];

        for (int i = 0; i < r; i++) {
            System.out.println("Enter no of column for a[" + i + "]: ");
            c = sc.nextInt();
            arr[i] = new int[c];
            System.out.println("Enter elements: ");
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("output");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}