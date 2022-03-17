import java.util.*;

class Student{
	int id;
	String name;
	String city;
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
}
public class ArrayLIstStudents
{
	public static void main(String[] args) {
		
		List<Student> s=new ArrayList<Student>(); //created arraylist to store students data
		
		Student s1=new Student(1,"mohit","nagpur");
		Student s2=new Student(2,"vinay","chandrapur");
		Student s3=new Student(3,"harshal","delhi");
		
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for(Student d:s) {
			System.out.println("student id   : "+d.id);
			System.out.println("student name : "+d.name);
			System.out.println("student city : "+d.city);
			System.out.println("___________________________________________");
		}
		
	}
}
