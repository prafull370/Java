import java.util.Scanner;

public class SpiralOrder {
    static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void matrixOrder(int[][]matrix,int r,int c){
        int totalEl=0;
        int toprow = 0, bottomrow = r - 1, leftcol = 0, rightcol = c - 1;
      while(totalEl<r*c) {

          // toprow -- leftCol to rightCol
          for (int j = leftcol; j <= rightcol&& totalEl<r*c; j++) {
              System.out.print(matrix[toprow][j] + " ");
              totalEl++;
          }
          toprow++;

          // rightCol -- topRow to bottomRow
          for (int i = toprow; i <= bottomrow && totalEl<r*c; i++) {
              System.out.print(matrix[i][rightcol] + " ");
              totalEl++;
          }
          rightcol--;
          // bottomRow -- rightCol to leftCol
          for (int j = rightcol; j >= leftcol&& totalEl<r*c; j--) {
              System.out.print(matrix[bottomrow][j] + " ");
              totalEl++;
          }
          bottomrow--;
          // leftCol -- bottomRow to topRow
          for (int i = bottomrow; i >= toprow&& totalEl<r*c; i--) {
              System.out.print(matrix[i][leftcol] + " ");
              totalEl++;
          }
          leftcol++;
      }
    }
    public static void main(String[] args) {
        System.out.println("Spiral Order row and column: ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        int total = row*col;
        System.out.println("Enter "+ total + "values");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Spiral matrix: ");
        matrixOrder(matrix,row,col);
    }
}
