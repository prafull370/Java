import java.util.*;
public class primeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number:");
        int n=sc.nextInt();
        System.out.print("Enter your second number:");
        int m=sc.nextInt();
        int flag=0;
        for(int i=n;i<=m;i++){
            for(int j=2;j<=i;j++){
                while(i%j==0){
                    flag++;
                }
                if(flag==1){
                    System.out.print(j);
                }
                if(flag>1){
                    break;
                }
            }
            
        }
    }
}
