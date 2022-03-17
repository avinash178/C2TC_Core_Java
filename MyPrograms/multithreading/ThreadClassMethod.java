
class Teacher1 extends Thread{                  // thread 1
	
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("Thread Class A: "+i);
	}
}
class Teacher2 extends Thread{                   // thread 2
	
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("Thread Class B: "+i);
	}
}
public class ThreadClassMethod {
	public static void main(String[] args) {
		// creating object of class A and class B
		Teacher1 object11= new Teacher1();
		Teacher2 object22= new Teacher2();
		
		
		
		// starting thread
		object11.start();
		object22.start();
		
		
		

		
	}

}
