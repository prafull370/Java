import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();
        int sum=0;
        int i;
        for(i=1;i<=10;i++){
            sum+=n;
            System.out.println(sum);
        }
    }
}
