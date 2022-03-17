import java.util.*;

public class Vector_1 {
	
	public static void main(String[] args) {
		Vector<String> names= new Vector<String>();
		names.add("neha");
		names.add("john");
		names.add("mukesh");
		names.add("prakash");
		
		System.out.println(names);
		
		
		System.out.println("-------------------------------------------------");
		
		names.addElement("rahul");   // addElement is vector method
		names.addElement("hari");
		System.out.println(names);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println(names.firstElement());    // firstElement of vector 
		System.out.println(names.lastElement());
		
		
	}

}
