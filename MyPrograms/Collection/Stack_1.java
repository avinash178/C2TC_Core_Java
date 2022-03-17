import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {
		

		Stack<String> n= new Stack<String>();
		
		n.push("salman");
		n.push("john");
		n.push("akshay");
		n.push("kapil");
		
		System.out.println(n);
		
		System.out.println(n.isEmpty());
		
		System.out.println(n.peek());  // get top element (last in first out)
	
		System.out.println(n.size());
	
		n.forEach(names-> System.out.println(names));  // iterating
		
		System.out.println("poped element   :"+n.pop());
		
		System.out.println("after poped     :" +n);
		
		System.out.println(n.search("john")); 
		System.out.println("kapil search :"+n.search("kapil"));
		
		
	
	}
	
}
