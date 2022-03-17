// here we will take reference of Human class
public class Dog {
	private String dogName;       // String variable 
	
	private Human owner;          // reference of Human , dog belong to owner
	
	
	
	// created constructor 
	public Dog(String dogName,Human owner) {
		this.dogName=dogName;
		this.owner=owner;
	}
	
	// creating tostring method to return fields parameter
	public String toString() {
		return dogName+"    "+owner;
	}

}
