class BankAccount{
	private int balance;
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public synchronized void withdraw(String name, int amount) {
		if(amount > balance) {
			System.out.println(name + "attemted to withdraw " + amount + "but insufficient balance ");
			return;
		}
		balance -= amount;
		System.out.println(name + " withdraw " + amount + "remaining balance " + balance);
	}
}

class Customer extends  Thread{
	private BankAccount account;
	private String name;
	private int amount;
	
	public Customer(BankAccount account, String name, int amount) {
		this.account = account;
		this.name = name;
		this.amount = amount;
	}
	
	public void run() {
		account.withdraw(name, amount);
	}
}
public class BankingSystem {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(500);
		Thread t1 = new Customer(account, "ajay", 300);
		Thread t2 = new Customer(account, "khuushi", 200);
		Thread t3 = new Customer(account, "ritesh", 400);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
