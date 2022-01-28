package topicwise.Exception_handling;
// use of throws 
public class ExceptionHandling3 {
	public static int divNum(int m,int n) throws ArithmeticException {
		int div=m/n;
		return div;
	}
public static void main(String[] args) {
	try {
	System.out.println(divNum(5,0));
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getLocalizedMessage()+" use brain");
	}
	
}
}
