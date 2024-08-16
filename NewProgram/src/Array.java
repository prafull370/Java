import java.util.*;

public class Array {
    public void print(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int [] num=new int[sc.nextInt()];
        int sum=0;
        int max=0;
        System.out.print("Enter the element you want to search in array list:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
            sum+=num[i];
            if(num[i]==n){
                System.out.println(" index of the search element: "+ i);
                break;
            }
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Maximum number of array:" + max);
        System.out.println("The sum of the elements of the array is "+sum);
//       print(num);

    }
}
