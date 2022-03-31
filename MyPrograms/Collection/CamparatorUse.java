import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Idcomparator implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.eId-o2.eId;
	}
	
}

class Emp {
	int eId;
	String eName;
	String eCity;

	public Emp(int eId, String eName, String eCity) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
}

public class CamparatorUse {

	public static void main(String[] args) {

		ArrayList<Emp> e = new ArrayList<Emp>();

		e.add(new Emp(34, "avinash", "pune"));
		e.add(new Emp(21, "riya", "mumbai"));
		e.add(new Emp(89, "sanjay", "delhi"));
		e.add(new Emp(45, "harshal", "kolkata"));

		// camparing with id
		//this method call Idcomparator class method compare
		Collections.sort(e,new Idcomparator());
		System.out.println("\n+++++++++++++++++++++ Id compare++++++++++++++\n");
		for (Emp d : e) { 
			System.out.println("employee id   : " + d.eId);
			System.out.println("employee name : " + d.eName);
			System.out.println("employee city : " + d.eCity);
			System.out.println("___________________________________________");
		}
		
		// comparing with name
		// created new object adding old object in it ,giving reference 
		ArrayList<Emp> e2 = new ArrayList<Emp>(e);
		System.out.println("\n+++++++++++++++ name comparing +++++++++++++++\n");
		Collections.sort(e2,new NameComparator());
		
		for (Emp d : e2) { 
			System.out.println("employee id   : " + d.eId);
			System.out.println("employee name : " + d.eName);
			System.out.println("employee city : " + d.eCity);
			System.out.println("___________________________________________");
		}

	}
}
