class NotEnoughBalance extends Exception {
  public NotEnoughBalance(String message) {
      super(message);
  }
}

class Account {
  private double balance;
  private static final double MINIMUM_BALANCE = 1000;

  public Account(double initialBalance) {
      if (initialBalance < MINIMUM_BALANCE) {
          throw new IllegalArgumentException("Initial balance cannot be less than minimum balance of " + MINIMUM_BALANCE);
      }
      this.balance = initialBalance;
  }

  public double getBalance() {
      return balance;
  }

  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
          System.out.println("Deposited: " + amount);
          System.out.println("Current balance: " + balance);
      } else {
          System.out.println("Deposit amount must be positive.");
      }
  }

  public void withdraw(double amount) throws NotEnoughBalance {
      if (amount <= 0) {
          System.out.println("Withdrawal amount must be positive.");
          return;
      }
      if (balance - amount < MINIMUM_BALANCE) {
          throw new NotEnoughBalance("Withdrawal denied! Insufficient balance. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.");
      }
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
      System.out.println("Current balance: " + balance);
  }

  public static void main(String[] args) {
      try {
          Account myAccount = new Account(2000);
          myAccount.deposit(500);
          myAccount.withdraw(1000);
          myAccount.withdraw(1500); // This will raise NotEnoughBalance exception
      } catch (NotEnoughBalance e) {
          System.out.println(e.getMessage());
      }
  }
}
