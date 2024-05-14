import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        System.out.println("Prafull kumar");
        System.out.println("Enter your array.");
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        int large=a[0];
        for(int i=0;i<3;i++){
            if(a[i]>large){
                large=a[i];
                System.out.print("large no. is:"+large);
            }
        }
    }
}
