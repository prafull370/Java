import java.util.Scanner;

public class factorial {
    public static void fact(int n){
        if(n<0){
            System.out.println("Invalid number\n");
            return;
        }
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        System.out.println(fact);
    }
    public static void main(String args[]){
        System.out.println("Enter your number >0:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
    }
}
