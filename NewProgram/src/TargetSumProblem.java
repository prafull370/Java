import java.util.Scanner;

public class TargetSumProblem {

    static int arrSum(int target,int []arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++) {
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    static int noOfTriplet(int target,int []arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your target sum: ");
        int target=sc.nextInt();
        System.out.println(arrSum(target,arr));
    }
}
