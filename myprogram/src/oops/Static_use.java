package oops;

class man{
    String name;
    static String country;                       // can access without object
    void walk()                              // can access through object
    {
    	System.out.println(name +" is walking ");
    } 
    static void eat() {                             // can access without object 
    	System.out.println("he is eating ");     //to use this method we do not have to create object 
    }
}
public class Static_use {
public static void main(String[] args) {
	man m1= new man();
	m1.name="harray";       // using object m1
	m1.walk();
	man.eat();                   // without object accessing 
	man.country="INDIA";            
}
}
