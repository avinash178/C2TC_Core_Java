class First extends Thread                              // thread 1
{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) 
			System.out.println("thread one");
		
	}
}
class Second extends Thread{                             // thread 2
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("thread two");
	}
	
}

public class JoinMethod {
	public static void main(String[] args) {
		// creating object of class first and second
		First t1=new First();                  
		Second t2= new Second();
		
		
		// starting t1 and t2 thread
		t1.start();
		t2.start();
		// setting name of thread
		t1.setName("mayur thread 1");
		t1.setPriority(10);               //setting t1 priority 10 high
		
		try {
			t2.join();         // others will wait until t2 finish
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}
	

}
