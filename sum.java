import java.util.*;
public class sum{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter erray size:");
        int n=sc.nextInt();
        int b[]=new int[n];
        int sum=new int();
        System.out.print("Enter your array number:");
        // int n=sc.nextInt();
        // sum.b=new sum();
        for(int i=0;i<b.length;i++){
           b[i]=sc.nextInt();

        }
        for(int i=0;i<b.length;i++){
            int sum=0;
            sum +=b[i];
        }
        System.out.print("Sum is:"+sum);
    }
}