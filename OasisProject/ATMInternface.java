package OasisProject;

	import java.util.Scanner;

class BankAccount{
	String name;
	String userName;
	String Password;
	String AccountNumber;
	float balance=10000f;
	int transaction=0;
	String transactionHistory=" ";
	
	public void register() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		this.name=sc.nextLine();
		System.out.println("Enter your username: ");
		this.userName=sc.nextLine();
		System.out.println("Enter your Password: ");
		this.Password=sc.nextLine();
		System.out.println("Enter your AccountNumber: ");
		this.AccountNumber=sc.nextLine();
		System.out.println("\nRegistration Successfull. Please Log in to your Bank Account");
	}
	public boolean login() {
		boolean isLogin=false;
		Scanner sc=new Scanner(System.in);
		while(!isLogin) {
			System.out.println("\nEnter your username: ");
			String username =sc.nextLine();
			if(username.equals(userName)) {
				while(!login) {
					System.out.println("\nEnter your password");
					String password=sc.nextLine();
					if(Password.equals(password)) {
						
					}
					}
			}
		}
	}
}
public class ATMInternface {

}

