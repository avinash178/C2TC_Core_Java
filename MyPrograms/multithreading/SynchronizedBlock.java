class BankOfMaharashtra{
	private float balance; 
	
	public BankOfMaharashtra(float balance)  // constructor for initializing values
	{
		this.balance=balance;
	}
	public void withdraw(float money) {     // withdraw method 

		if(balance>=money) {
			balance=balance-money;
			System.out.println(Thread.currentThread().getName()+" have withdraw :"+money);
		}
		else {
			System.out.println(Thread.currentThread().getName()+" have insuffisient Bank balance ");
		}
		System.out.println("Your Bank balance is :"+balance);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

class User extends Thread{
	private float money;
	private BankOfMaharashtra bank;
	
	public User(float money,BankOfMaharashtra bank) {
		this.money=money;
		this.bank=bank;
	}
	@Override
	public void run() {
		synchronized(this) {
			bank.withdraw(money);
		}
	}
}
public class SynchronizedBlock {
	public static void main(String[] args) {
		BankOfMaharashtra bank= new BankOfMaharashtra(2000);
		
		User mom = new User(500,bank);
		User dad = new User(600,bank);
		
		mom.setName("Mother");
		dad.setName("Father");
		
		mom.start();
		dad.start();
		
		
	}
	
	

}
