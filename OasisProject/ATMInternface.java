package OasisProject;

import java.util.Scanner;

class BankAccount {
	String name;
	String userName;
	String Password;
	String AccountNumber;
	float balance = 10000f;
	int transaction = 0;
	String transactionHistory = " ";

	public void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		this.name = sc.nextLine();
		System.out.println("Enter your username: ");
		this.userName = sc.nextLine();
		System.out.println("Enter your Password: ");
		this.Password = sc.nextLine();
		System.out.println("Enter your AccountNumber: ");
		this.AccountNumber = sc.nextLine();
		System.out.println("\nRegistration Successfull. Please Log in to your Bank Account");
	}

	public boolean login() {
		boolean isLogin = false;
		Scanner sc = new Scanner(System.in);
		while (!isLogin) {
			System.out.println("\nEnter your username: ");
			String username = sc.nextLine();
			if (username.equals(userName)) {
				while (!isLogin) {
					System.out.println("\nEnter your password");
					String password = sc.nextLine();
					if (Password.equals(password)) {
						System.out.println("\nLogin Successful");
						isLogin = true;
					} else {
						System.out.println("\nIncorrect Password");
					}
				}
			} else {
				System.out.println("\nUsername not found");
			}
		}
		return isLogin;
	}

	public void withdraw() {
		System.out.println("\nEnter Amount to Withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		try {
			if (balance >= amount) {
				transaction++;
				balance -= amount;
				System.out.println("\n Withdraw Successful.");
				String str = amount + "Rs withdraw\n";
				transactionHistory = transactionHistory.concat(str);
			} else {
				System.out.println("\nInsufficient Balance.");
			}
		} catch (Exception e) {
		}
	}

	public void deposit() {
		System.out.println("\nEnter Amount to Deposit: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		try {
			if (10000f >= amount) {
				transaction++;
				balance += amount;
				System.out.println("\n Deposit Successful.");
				String str = amount + "Rs Deposit\n";
				transactionHistory = transactionHistory.concat(str);
			} else {
				System.out.println("\nSorry the limit is 10000.");
			}
		} catch (Exception e) {
		}
	}

	public void transfer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Receipent Name: ");
		String receipent = sc.nextLine();
		System.out.println("\n Enter Amount to transfer: ");
		float amount = sc.nextFloat();
		try {
			if (balance >= amount) {
				if (amount <= 50000f) {
					transaction++;
					balance -= amount;
					System.out.println("\n Transfer Successful to." + receipent);
					String str = amount + "Rs tranfers to" + receipent + "\n";
					transactionHistory = transactionHistory.concat(str);
				} else {
					System.out.println("\nLimit is 50000.");
				}
			} else {
				System.out.println("\nInsufficient balance.");
			}
		} catch (Exception e) {
		}
	}

	public void checkBalance() {
		System.out.println("\nYour Balance:" + balance + "Rs");
	}

	public void transHistory() {
		if (transaction == 0) {
			System.out.println("NO transtions Happen");
		} else {
			System.out.println("\ntransaction History");
		}
	}
}

public class ATMInternface {
	public static int takenIntegerInput(int limit) {
		int input = 0;
		boolean flag = false;

		while (!flag) {
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				flag = true;
				if (flag && input > limit || input < 1) {
					System.out.println("Choosse the number between 1 to " + limit);
					flag = false;
				}
			} catch (Exception e) {
				System.out.println("Enter only integer value.");
				flag = false;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		System.out.println("\n***Welcome To NAtive ATM INTERFACE***");
		System.out.println("\n1.For register\n2. For Exit. ");
		System.out.println("Choose one option: ");
		int choose = takenIntegerInput(2);

		if (choose == 1) {
			BankAccount b = new BankAccount();
			b.register();
			while (true) {
				// System.out.println("\n***Welcome To NAtive ATM INTERFACE***");
				System.out.println("1.Login\n2. For Exit. ");
				System.out.println("Enter your choice: ");
				int ch = takenIntegerInput(2);
				if (ch == 1) {
					if (b.login()) {
						System.out.println("\nWelcome Back" + b.name + "  ");
						boolean isFinished = false;
						while (!isFinished) {
							System.out.println(
									"\n1.Withdraw \n 2. Deposit\n3.Tranfer \n4. check Balance\n5. Check Transaction History \n6.Exit");
							System.out.println("Enter your choice:");
							int c = takenIntegerInput(2);
							switch (c) {
								case 1:
									b.withdraw();
									break;
								case 2:
									b.deposit();
									break;
								case 3:
									b.transfer();
									break;
								case 4:
									b.checkBalance();
									break;
								case 5:
									b.transHistory();
									break;
								case 6:
									isFinished = true;
									break;
								default:
									break;
							}
						}
					}
				} else {
                    System.exit(0);
				}

			}
		}
		else {
			System.exit(0);
		}

	}
}
