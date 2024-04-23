import java.util.*;
public class calculator {
    public static void main(String[] args){
        int operator,n1,n2;
        System.out.println("1-Add\n 2-Sub");

        Scanner sc=new Scanner(System.in);
        operator=sc.nextInt();
        System.out.println("Enter your first number");
        n1=sc.nextInt();
        System.out.println("Enter your second number");
        n2=sc.nextInt();
        switch(operator){
            case 1:System.out.print( n1+n2);
            break;
            case 2: System.out.println(n1-n2);
            break;
            default:System.out.println("Invalid input");
        }
    }
}
