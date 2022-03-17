import java.util.*;

class Employee{
	int empId;
	String empName;
	
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
}
public class LinkedHashSet_1 {
	public static void main(String[] args)
	{
		LinkedHashSet<Employee> data=new LinkedHashSet<Employee>();
		
		Employee e1=new Employee(1,"vinay trishule");
		Employee e2=new Employee(2,"ashey sharma");
		Employee e3=new Employee(3,"shahzar mazhar");
		
		data.add(e1);
		data.add(e2);
		data.add(e3);
		
		
		for(Employee n:data) {
			
			System.out.println(n.empId);
			System.err.println(n.empName);
			
		}
		
		
	}

}
