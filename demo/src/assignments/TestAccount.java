package assignments;

class SavingsAccount {
	private int acno;
	private String customer;
	private double balance;

	public SavingsAccount(int ano, String c) {
		acno = ano;
		customer = c;
	}

	public SavingsAccount(int ano, String c, double b) {
		acno = ano;
		customer = c;
		balance = b;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}

public class TestAccount {

	public static void main(String[] args) {
		 SavingsAccount s = new SavingsAccount(1, "Edwards");
		 s.deposit(10000);
		 System.out.println(s.getBalance());

	}

}
