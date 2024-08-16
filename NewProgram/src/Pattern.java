import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
        System.out.print("Enter number rows and colums for pattern: ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
//        int c=sc.nextInt();

//        square pattern


//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=r;j++){
//            if(i==1||i==r||j==1||j==r)
//                System.out.print("*");
//            else System.out.print(" ");
//            }
//            System.out.println();
//        }

//        number pattern

//        for(int i=1;i<=r;i++){
//            for(int j=i;j<=r;j++) {
//                System.out.print(j);
//            }
//            for(int j=1;j<=i-1;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        alternate number pattern

        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else System.out.print("2");
            }
            System.out.println();
        }
    }
}
