import java.util.Scanner;
public class charpattern {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your matrix size");
    int n=sc.nextInt();
    System.out.println("Enter you character:");
    char c=sc.next().charAt(0);
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print(c++ +" ");
        }
        System.out.println();
    }
    }
}