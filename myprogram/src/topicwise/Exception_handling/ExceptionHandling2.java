package topicwise.Exception_handling;
import java.util.Scanner;
 // use of throw
// throw-  "used to throw an exception explicitly"


public class ExceptionHandling2 {
	static void voting(int age)
	{
		if(age<18) {
			throw new ArithmeticException(" you are not eligible to vote");
		}
		else
			System.out.println("you can vote");
	}
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age=input.nextInt();
	voting(age);
	input.close();
}
}
