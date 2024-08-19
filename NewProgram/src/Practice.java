import java.util.Arrays;
import java.util.Scanner;
public class Practice {
    static void print(int[] arr){
        for(int p:arr){
            System.out.print(p+" ");
        }
    }
    static boolean sorted(int[] arr){
        boolean sort=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) {
                sort=false;
                break;
            }
        }
        return sort;
    }
    static int secLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        int secL=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secL=max;
                max=arr[i];
            }
        }
        return secL;
    }
    static int fRepeat(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s=sc.nextInt();
        int []arr=new int[s];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i< s; i++){
            arr[i]=sc.nextInt();
        }
//        boolean res=sorted(arr);

        System.out.println("First repeated value is: "+fRepeat(arr));

//        System.out.println("Second largest number : "+ secLargest(arr));

//        System.out.println("which element you want to search: ");
//        int f=sc.nextInt();
//        int elem = 0;
//        for(int i=0;i<s;i++){
//            if(arr[i]>f){
//                elem++;
//            }
//        }
//        System.out.println("Last oocurenceof element: "+ elem);
    }
}
