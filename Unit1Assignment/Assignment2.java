import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array.");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.print("Enter your number:");
        for(int i=0;i<s;i++){
        arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<s;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum is:"+sum);
    }
}
