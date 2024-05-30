import java.util.*;
public class matrixmultiply {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.print("Enter your first matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int a[i][j]=sc.nextInt();
            }
        }
    }
    
}
