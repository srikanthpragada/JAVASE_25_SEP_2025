package assignments;

class SavingsAccount {
	private int acno;
	private String customer;
	private double balance;

	public SavingsAccount(int acno, String customer) {
		this.acno = acno;
		this.customer = customer;
	}

	public SavingsAccount(int acno, String customer, double balance) {
		this(acno, customer); // call another constructor 
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}
}

public class TestAccount {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(1, "Edwards");
		s.deposit(10000);
		System.out.println(s.getBalance());

	}

}
