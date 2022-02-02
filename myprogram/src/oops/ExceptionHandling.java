package oops;


public class ExceptionHandling {
public static void main(String[] args) {
	try {          
	int a=5;
	int b=0;
	int c=a/b;                // throw exception
	System.out.println(c);
	}
	
	catch(ArithmeticException e){   //
		 System.out.println(e.getMessage()+" Please check your code");
		
	}
	finally {
		System.out.print("Always executed whether an exception is handled or not. ");
		System.out.println("It like defult in switch ");
	}
	System.out.println("Very important code");   // too run further  important code try catch needed
}
}
