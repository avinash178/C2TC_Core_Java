import java.util.*;

public class LinkedList_1 {

	public static void main(String[] args) {
		
		List<String> names=new LinkedList<String>();  
		
		names.add("akash");
		names.add("vinay");
		names.add("rahul");
		names.add("aashey");
		
		
		
		System.out.println(names);
		for(String n:names)					// traverse using for each loop
		{
			System.out.println(n);
			
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		for(int i=0;i<names.size();i++) 				// traverse using for loop
		{
			System.out.println("names of friends :" +names.get(i));
			
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		List<String> friends =new LinkedList<String>();  //  creating new list 
		
		friends.add("lokesh");
		friends.add("shivani");
		friends.add("riya");
		friends.add("sakshi");
		
		// adding list name into friends 
		names.addAll(friends);
		
		System.out.println(names); 
		
		System.out.println("-------------------------------------------------------------------");
		
		
		Iterator<String> i=names.iterator(); 		//traverse form Arraylist  using iterator
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
