class ThreadOne extends Thread{
	public void run() {
		try {
			Thread.sleep(2000);            //this thread will sleep for 2sec
			for(int i=0;i<5;i++) {
				System.out.println(i);
				}
				
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class SleepMethod {
	public static void main(String[] args) {
		ThreadOne t1= new ThreadOne();             // object of ThreadOne class
		
		
		t1.start();
		
		for(int i=0;i<5;i++)
			System.out.println("this is main thread  :"+Thread.currentThread().getName());

	
	}

}
