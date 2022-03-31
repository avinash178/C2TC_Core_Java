import java.util.Comparator;


// this is class is used in CamparatorUse class 
// give Emp class name inside Comparator to perform compare on name
public class NameComparator implements Comparator<Emp> {


	@Override
	public int compare(Emp o1, Emp o2) {
		
		// to compare two Strings we use compareTo function
		return o1.geteName().compareTo(o2.geteName());
	}

}
