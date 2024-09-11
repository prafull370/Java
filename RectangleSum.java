import java.util.Scanner;

public class RectangleSum {

    // bruteforce
//    static void prefixSum1(int[][] arr) {
//        int row = arr.length;
//        int col = arr[0].length;
//        for (int i = 0; i < row; i++) {
//            for (int j = 1; j < col; j++) {
//                arr[i][j] += arr[i][j - 1];
//            }
//        }
//    }

    static void prefixSum2(int[][] arr){// cal row and col sum  and every element aum of rectnagle
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++){ // traverse horizontally to row wise sum
            for(int j=1;j<col;j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        // for vertically to cal column sum
        for(int i=0;i<col;i++){
            for(int j=1;j<row;j++){
                arr[i][j]+=arr[j-1][i];
            }
        }
    }
//    static int findSum(int[][] arr,int x1,int y1,int x2,int y2){
//        int sum = 0;
//        prefixSum1(arr);
//        for(int i=x1;i<=x2;i++ ) {
//            // r1 to r2 sum for row i
//            if(y1>=1)
//            sum += arr[i][y1]-arr[i][y2];
//            else sum += arr[i][y2];
//        }
//        return sum;
//    }
    // best approach to find sum;
    static int findSum2(int[][] arr,int x1,int y1,int x2,int y2){
        int sum = 0;
        prefixSum2(arr);
        int ans=0,up=0,left=0,leftup=0;
        sum=arr[x2][y2];
        left=arr[x2][y1-1];
        up=arr[x1-1][y2];
        leftup=arr[x1-1][y2-1];
        ans = sum-up-left+leftup;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and column size: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter number: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter your sum coordinate: ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
//        System.out.print("Rectangle Sum: "+findSum(arr,x1,y1,x2,y2));
        System.out.print("Rectangle Sum: "+findSum2(arr,x1,y1,x2,y2));
    }
}
