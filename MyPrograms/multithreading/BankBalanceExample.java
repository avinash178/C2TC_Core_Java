class Bank{                      // Bank class as resources
	private float balance=0;        //  bank has balance 
	
	public Bank(float balance)     // constructor for initializing balance
	{
		this.balance=balance;
	}
	
	public void withdrawMoney(float money){    // method to access money
		synchronized(this){
		if(balance>=money) {
			balance=balance-money;
			System.out.println(Thread.currentThread().getName()+" have withdraw "+money+" ruppee");
		}
		else {
			System.out.println("Your bank balance is insufficient ");
		}
		System.out.println("Balance in Account "+balance);
	}
	}
}

class Dad extends Thread{
	private Bank bank;
	private float money;
	public Dad(Bank bank, float money) {
		this.bank=bank;
		this.money=money;
	}
	public void run()
	{
		bank.withdrawMoney(money);
	}
}
class Mother extends Thread{
	private Bank bank;
	private float money;
	public Mother(Bank bank, float money)
	{
		this.bank=bank;
		this.money=money;
		
	}
	public void run() {
		bank.withdrawMoney(money);
	}
}
public class BankBalanceExample {
	public static void main(String[] args) {
		
		Bank b1=new Bank(2000);       // created object and passed balance to constructor
		
		Dad d1=new Dad(b1,500);       // created thread and withdrawing 500 ruppes 
		
		Mother  m1=new Mother(b1,700); // created thread and withdrawing 700 rupees
		
		// setting thread names
		d1.setName("Dad");
		m1.setName("Mother");
		
		d1.start();
		m1.start();
	}

}
