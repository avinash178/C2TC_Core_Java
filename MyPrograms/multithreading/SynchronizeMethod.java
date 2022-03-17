class Table{                         // threads will access this as resources 
	
	synchronized void printTable(int n) {     // synchronized method will put lock to resources
		System.out.println("Table of "+n);
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(10);            // thread will sleep for 1sec
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("\n");
	}
}
 // this class will thread 1 which will try to access resources from table
class Five extends Thread{
	private Table t;       //reference of Table class

	// creating constructor
	public Five(Table t) {
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
	
}

// this class will thread 2 which will try to access resources from table
class Ten extends Thread{
	private Table t;
	
	public Ten(Table t) {
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(10);
	}
	
	
}
public class SynchronizeMethod {

	public static void main(String[] args) {
		Table table =new Table();
		
		// creating threads 
		Five t5=new Five(table);
		Ten t2=new Ten(table);
		
		t5.start();
		t2.start();
	}
}

