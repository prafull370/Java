import java.util.Scanner;
public class arrayCounter{
    static int ocurrence(int arr[],int x){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter of input array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter"+n+"elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter value u want to search:");
            int x=sc.nextInt();
        System.out.println("count of x: "+ocurrence(arr, x));
    }
}