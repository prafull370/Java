import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After swapping two numbers: "+a+" " +b);
    }
}
