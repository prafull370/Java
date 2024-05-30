import java.util.*;
public class interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal:");
        float p=sc.nextFloat();
        System.out.print("Enter rate: ");
        float r=sc.nextFloat();
        System.out.print("Enter time:");
        float t=sc.nextFloat();
        float  amount= (p*r*t)/100;
        System.out.print("Your amount is:"+amount);
    }
    
}
