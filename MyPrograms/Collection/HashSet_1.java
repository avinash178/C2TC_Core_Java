import java.util.*;

class Students
{
	int id;
	String name;
	String major;
	
	Students(int id,String name,String major){
		this.id=id;
		this.name=name;
		this.major=major;
		
	}
}

public class HashSet_1 {

	public static void main(String[] args) {
		
		HashSet<Integer> number=new HashSet<Integer>();   //crating integer set 
		number.add(87);
		number.add(84);
		number.add(23);
		number.add(13);
		System.out.println(number);
		
		HashSet<Students> s= new HashSet<Students>();     // creating set to add students details
		
		
		Students s1=new Students(1,"rahul","biology");// creating objects
		Students s2=new Students(2,"utkarsh","History");
		Students s3=new Students(3,"vinay","geography");
		
		s.add(s1);			// adding students info
		s.add(s2);
		s.add(s3);
		
		
		for(Students i:s) 			// traversing through hashset
		{
			System.out.println("Id    :"+i.id);
			System.out.println("name  :"+i.name);
			System.out.println("major :"+i.major);
			System.out.println("______________________________________________________________________________");
		}
		
	}
}
