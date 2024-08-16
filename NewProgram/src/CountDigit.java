import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number: To check digit");
        Scanner sc = new Scanner(System.in);
        int n;
        int count=0;
        n=sc.nextInt();
        int sum=0;
        int rev = 0;
        int originalN=n;
        while(n!=0){
            int r=n%10;
            rev=rev*10;
            rev+=r;
            sum=sum+r;
            n= n/10;
            count++;

        }
        System.out.println("OriginalNumber: "+originalN+" Digit: "+count+ "Digit Sum: " + sum + "Digit Rev: " + rev);
    }
}
