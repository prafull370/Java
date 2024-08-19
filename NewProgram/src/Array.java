import java.util.*;

public class Array {
    static void print(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void swapArray(int[] arr){
        System.out.println("Reverse Array is: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    static void rotateArray(int[] arr){
        int n=arr.length;
        System.out.println("Rotate Array is: __ time");
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        print(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int [] num=new int[sc.nextInt()];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        rotateArray(num);
//        swapArray(num);
    }
}
