package oops;
class man1{
	String name;
	int age;
	static int count=0;
	public man1() {
		count++;                // to count number of man 
		System.out.println("I am default constructor ");
	}
	public man1(String name, int age) {
		this();            // 1-using this you can call default constructor 
		System.out.println("my name "+name+" my age is "+age);
		
	}
	public man1(String New_name) {
		this.name=New_name;       // 2-it refer current class instance variable name
		System.out.println("my name is "+name);
	}
	
	void walk() {
		System.out.println(name+" is walking ");
	}
	
	void run() {
		// you can invoke without "this" also , compiler automatically add "this" keyword
		this.walk();   //  3-to  invoke current class method
		System.out.println(name+" is running");
	}
	
}
public class This_use {
	  
public static void main(String[] args) {
	man1 m1= new man1("rahul",32);
	man1 m2 =new man1("ganesh");
	man1 m3 =new man1 ();
	m3.name= "vinay";
	m3.run();
	
	
}
}
