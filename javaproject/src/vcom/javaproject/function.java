import java.util.*;
public class function{
    public static int add(int a,int b){
        int sum=a+b;
        System.out.println("Your sum is: "+sum);
        return 0;
    }
    public static void main(String args[]){
        System.out.println("Enter your number A and B: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
    }
}