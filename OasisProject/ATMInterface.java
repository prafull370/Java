package oasisproject;

import java.util.Scanner;

class BankAccount {
    String name;
    String userName;
    String password;
    String accountNumber;
    float balance = 10000f;
    int transactionCount = 0;
    String transactionHistory = "";

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = sc.nextLine();
        System.out.println("Enter your username: ");
        this.userName = sc.nextLine();
        System.out.println("Enter your password: ");
        this.password = sc.nextLine();
        System.out.println("Enter your account number: ");
        this.accountNumber = sc.nextLine();
        System.out.println("\nRegistration Successful. Please log in to your bank account.");
    }

    public boolean login() {
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);
        while (!isLogin) {
            System.out.println("\nEnter your username: ");
            String username = sc.nextLine();
            if (username.equals(userName)) {
                while (!isLogin) {
                    System.out.println("Enter your password: ");
                    String password = sc.nextLine();
                    if (this.password.equals(password)) {
                        System.out.println("\nLogin Successful");
                        isLogin = true;
                    } else {
                        System.out.println("Incorrect password. Try again.");
                    }
                }
            } else {
                System.out.println("Username not found. Try again.");
            }
        }
        return isLogin;
    }

    public void withdraw() {
        System.out.println("\nEnter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (balance >= amount) {
            transactionCount++;
            balance -= amount;
            System.out.println("\nWithdraw successful.");
            String str = amount + " Rs withdrawn.\n";
            transactionHistory = transactionHistory.concat(str);
        } else {
            System.out.println("\nInsufficient balance.");
        }
    }

    public void deposit() {
        System.out.println("\nEnter amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount <= 10000f) {
            transactionCount++;
            balance += amount;
            System.out.println("\nDeposit successful.");
            String str = amount + " Rs deposited.\n";
            transactionHistory = transactionHistory.concat(str);
        } else {
            System.out.println("\nThe deposit limit is 10000 Rs.");
        }
    }

    public void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter recipient name: ");
        String recipient = sc.nextLine();
        System.out.println("Enter amount to transfer: ");
        float amount = sc.nextFloat();
        if (balance >= amount) {
            if (amount <= 50000f) {
                transactionCount++;
                balance -= amount;
                System.out.println("\nTransfer successful to " + recipient + ".");
                String str = amount + " Rs transferred to " + recipient + ".\n";
                transactionHistory = transactionHistory.concat(str);
            } else {
                System.out.println("\nThe transfer limit is 50000 Rs.");
            }
        } else {
            System.out.println("\nInsufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("\nYour balance: " + balance + " Rs.");
    }

    public void transHistory() {
        if (transactionCount == 0) {
            System.out.println("No transactions have occurred.");
        } else {
            System.out.println("\nTransaction History:");
            System.out.println(transactionHistory);
        }
    }
}

public class ATMInterface {
    public static int takeIntegerInput(int limit) {
        int input = 0;
        boolean flag = false;
        while (!flag) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                flag = true;
                if (input > limit || input < 1) {
                    System.out.println("Choose a number between 1 and " + limit);
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Enter an integer value.");
                flag = false;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("\n*** Welcome to Native ATM Interface ***");
        System.out.println("\n1. Register\n2. Exit");
        System.out.print("Choose an option: ");
        int choose = takeIntegerInput(2);

        if (choose == 1) {
            BankAccount b = new BankAccount();
            b.register();
            while (true) {
                System.out.println("\n1. Login\n2. Exit");
                System.out.print("Enter your choice: ");
                int ch = takeIntegerInput(2);
                if (ch == 1) {
                    if (b.login()) {
                        System.out.println("\nWelcome back, " + b.name + ".");
                        boolean isFinished = false;
                        while (!isFinished) {
                            System.out.println("\n1. Withdraw\n2. Deposit\n3. Transfer\n4. Check Balance\n5. Check Transaction History\n6. Exit");
                            System.out.print("Enter your choice: ");
                            int c = takeIntegerInput(6);
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
        } else {
            System.exit(0);
        }
    }
}
