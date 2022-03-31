import java.util.ArrayList;

public class ArrayListUnsafe {
	public static void main(String[] args) {
		System.out.println("Unsafe collection");
		
		ArrayList l=new ArrayList();// collection with different dataTypes
		l.add("aviansh");
		l.add(354);
		l.add("rahul");
		l.add(34.53);
		System.out.println(l);
	}

}
