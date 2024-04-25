import java.util.*;
public class fibo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your starting number:");
        int n=sc.nextInt();
        System.out.print("Entre your last number:");
        int m=sc.nextInt();
        int a=0,b=1,c=0;
        while(true){
            c=a+b;
            a=b;
            b=c;
            if(n<=c&&m>=c){
                System.out.print("Fibonachi serise: " + c);
            }
            if(c>m){
                System.out.println("not print");
                break;
            }
        }
    }
}
