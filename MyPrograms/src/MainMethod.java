
public class MainMethod {

	public static void main(String[] args) {
		
		Human obj1= new Human("avinash");  // created object of Human
		
		// here Dog object taking Human object reference (obj1)
		Dog   obj2= new Dog("tom",obj1);   // created object of Dog 
		
		
		
		System.out.println(obj2);
	}
}
