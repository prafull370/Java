import java.util.Scanner;

public class hey {
    public class show{
        static void print(int[][] arr,int r, int c){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        static int  tranpose(int[][] arr,int r, int c){
            for(int i=0;i<c;i++){
                for(int j=i+1;j<r;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            return arr[r][c];
        }
        static int rev(int[][] arr,int r, int c){
            for(int i=0;i<r;i++){
                for(int j=0;j<c/2;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[i][c-j-1];
                    arr[i][c-j-1]=temp;
                }
            }
            return arr[r][c];
        }
        static int[][]pascal(int n){
            int[][] ans=new int[n][];
            for(int i=0;i<n;i++){
                ans[i]=new int[n+1];
                ans[i][0]=ans[i][1]=1;
                for(int j=1;j<n+1;j++){
                    ans[i][j]=ans[i][j-1]+ans[i-1][j];
                }
            }
            return ans;
        }
    }

    public static void main(String[] args){
//        System.out.println("Hey");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: \n");
        int r=sc.nextInt();
//        System.out.println("Enter the size of column: \n");
//        int c=sc.nextInt();
//        int[][] arr=new int[r][c];
//        System.out.println("Enter the elements of array: ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }


          int[][] ans= show.pascal(r);
          for(int i=0;i<ans.length;i++){
              System.out.println(i);
          }

//        show.tranpose(arr,r,c);
//        show.rev(arr,r,c);
//        show.print(arr,r,c);
    }
}
