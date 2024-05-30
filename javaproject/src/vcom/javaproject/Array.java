 import java.util.*;
 public class Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int number[]=new int[size];
        System.out.println("Enter array number: ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("which number you finds:");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(number[i]==x){
                System.out.println("x found at index: "+ i);
            }
            else{
                System.out.println("Numver is not find.");
            }
        }
    }
}
