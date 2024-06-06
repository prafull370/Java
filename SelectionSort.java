import java.util.*;

public class SelectionSort {

    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min!= i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size o Array: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements of Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int[] arr = {7,2,5,1, 8, 3};
        sort(arr);
        System.out.println("sorted Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}