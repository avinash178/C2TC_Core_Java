
import java.util.*;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		// creating object of Arraylist students
		List<String> students=new ArrayList<String>();
		
		students.add("mohit");
		students.add("sanik");
		students.add("tejas");
		students.add("manash");
		
		System.out.println(students);   // only printing object here
		System.out.println("-------------------------------------------------------");
		
		
		// iterating using for loop
		
		for(int i=0;i<students.size();i++)		
		{
			System.out.println("Name of student  "+(i+1)+" :"+students.get(i));
		}
		
		
		
		System.out.println("-------------------------------------------------");
		
		
		
		
		// traverse form Arraylist  using iterator
		
		Iterator<String> i=students.iterator();
		
		while(i.hasNext())
		{
			System.out.println("Name of student: "+i.next());
			
			
		}
		
		System.out.println("---------------------------------------------------");
		
		// traverse using for each loop
		
		for(String s:students)
		{
			System.out.println(s);
		}
		
		
		
		
		System.out.println("---------------------------------------------------");
		
		
		// setting element name 
		// changing name of index 1 and 0
		students.set(1, "harshal");
		students.set(0,"Ashey");
		
		//removing element from index 3
		
		students.remove(3);
		
		System.out.println(students);  // manash removed and harshal , Ashey added
		
		
	
	}
}
