import java.util.Scanner;

public class patternCloud {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        int dig=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0) {
                for (int j = 1; j < i + 1; j++) {
                    System.out.print(dig+" ");
                    dig++;
                }
            }else{
                dig+=i-1;
                for(int j=1;j<=i;j++){
                    System.out.print(dig+" ");
                    dig--;
                }
                dig +=i+1;
            }
            System.out.println();
        }
    }
}
