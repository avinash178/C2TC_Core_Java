

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"\t "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}
public class ThreadPriority {
	
	public static void main(String[] args) {
		MyThread tr=new MyThread();         // object of MyThread
		
		// creating thread
		Thread t1=new Thread(tr,"Thread 1");
		Thread t2=new Thread(tr,"Thread 2");
		Thread t3=new Thread(tr,"Thread 3");
		
		// assigning thread priority
		t1.setPriority(Thread.MIN_PRIORITY);  
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		// starting Threads
		t1.start();
		t2.start();
		t3.start();
	}

}
