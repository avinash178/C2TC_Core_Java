import java.util.*;

class Student implements Comparable<Student>{
	int sId;
	String name;
	String city;
	
	
	public Student(int sId, String name, String city) {
		super();
		this.sId = sId;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return sId;
	}

	public void setId(int id) {
		this.sId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// comparing id wise
	@Override
	public int compareTo(Student o) {
		
		return this.sId-o.sId;  // this will compare object student with other object 
	}
	
	
	
}
public class ComparableUse 
{

	public static void main(String[] args) {
		
		List<Student> s=new ArrayList<Student>(); //created arraylist to store students data
		
		s.add(new Student(14,"mohit","nagpur") );
		s.add(new Student(62,"vinay","chandrapur"));
		s.add(new Student(38,"harshal","delhi"));
		s.add(new Student(4,"shivani","panvel"));
		
		Collections.sort(s);   // this will call compareTo method and give sorted data 
		for(Student d:s) {
			System.out.println("student id   : "+d.sId);
			System.out.println("student name : "+d.name);
			System.out.println("student city : "+d.city);
			System.out.println("___________________________________________");
		}
		
	}

	
}
