import java.util.*;
public class reversestring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String n=sc.nextLine ();
        
        for(int i=n.length()-1;i>=0;i--){
            System.out.print("your reverse string is:");
            System.out.println(n.charAt(i));
        }
    }
}