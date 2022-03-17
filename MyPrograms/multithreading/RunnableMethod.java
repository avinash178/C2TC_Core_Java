
class A implements Runnable                     // class A for thread 1
	{
		// run method of runnable interface
		public void run() {
			
			for(int i=0;i<10;i++)
				System.out.println("thread class A: "+i);
		}
	}
	class B implements Runnable{                 // class B for thread 2
		public void run() {
			for(int i=0;i<10;i++)
				System.out.println("thread class B: "+i);
		}
	}
	
public class RunnableMethod {
	
	public static void main(String[] args) {
		
		// crating object of method A and B
		A object1 = new A();   
		B object2 = new B();
		
		
		// creating object of thread class and passing object of A and B
		Thread t1= new Thread(object1,"Thread Name t1");     // define thread name 
		Thread t2= new Thread(object2,"Thread Name t2");
		
		// starting threads
		t1.start();
		t2.start();
		
		//get thread name my invoking getName method
		System.out.println("thread name is :"+t1.getName());
		System.out.println("thread name is :"+t2.getName());
	}
	

}
