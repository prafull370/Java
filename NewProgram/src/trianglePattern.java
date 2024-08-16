import java.util.Scanner;

public class trianglePattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
//        int c=sc.nextInt();

//        Reverse triangle

//        for(int i=r;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pyramid question

//        for(int i=1;i<=r;i++){ // traverse row
//            for(int j=1;j<=r-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        // alternate number pyramid

        for(int i=1;i<=r;i++){

            for(int j=1;j<=r-i;j++){   // for spaces
                System.out.print(" ");
            }
//            written 1 to i
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
//            print i to 1
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
