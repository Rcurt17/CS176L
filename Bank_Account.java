package Problems3;

public class Bank_Account {
	
	private String accountName;
	private double Balance;
	
	public Bank_Account() {
		accountName = "Default Name";
		Balance = 0.0;
		
	}
	
	public Bank_Account(double Balance) {
		this.Balance = Balance;
		
	}
	
	public Bank_Account(String name, double Balance) {
		accountName = name;
		this.Balance = Balance;
		
	}
	
	public void deposit(double DepositAmount) {
		Balance += DepositAmount;
	}
	
	public void withdraw(double WithdrawAmount) {
		Balance -= WithdrawAmount;
	}
	
	public double getBalance() {
		return Balance;
	}
	

	public static void main(String[] args) {
		Bank_Account Account1 = new Bank_Account();
		Bank_Account Account2 = new Bank_Account(4000);
		Bank_Account Account3 = new Bank_Account("Raul", 2003);
		
		System.out.println("Account 1 Balance: "+ Account1.getBalance());
		Account2.deposit(700);
		System.out.println("Account 2 Balance: "+ Account2.getBalance());
		Account3.withdraw(50);
		System.out.println("Account 3 Balance: "+ Account3.getBalance());

	}

}
