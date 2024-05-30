import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row and column:");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int matrix[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Which number you want to search:");
        int x=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==x){
                    System.out.println("your position:"+i+","+j);
                }
            }
        }
    }
}
