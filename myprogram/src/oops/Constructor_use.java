package oops;
class Man{
	String name;
	int age;
	public Man(){         // this is  default constructor 
		System.out.println("creating object");
	}
	public Man(int New_age,String New_name) {   // constructor overloading
		age=New_age;
		name=New_name;
		System.out.println("my name is "+name+" and i am "+age);
	}
	void eat() {
		System.out.println(name+" having food");
	}
	void eat(String dish){                       // method overloading
		System.out.println(name+" having "+dish);
	}
	
	
}
public class Constructor_use {
public static void main(String[] args) {
	Man m1 = new Man();           // man() calling default constructor
	m1.name="shivani";
	m1.eat();               //  
	m1.eat("fish");          // this is called polymorphism
	Man m2=new Man(23,"rahul");    
	m2.age=44;
	m2.name="hariom";
	
	
	
}
}
