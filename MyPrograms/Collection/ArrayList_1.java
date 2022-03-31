
import java.util.*;

public class ArrayList_1 {

	public static void main(String[] args) {

		// creating object of Arraylist students
		List<String> students = new ArrayList<String>();

		students.add("mohit");
		students.add("sanik");
		students.add("tejas");
		students.add("manash");

		System.out.println(students); // only printing object here
		System.out.println("-------------------------------------------------------");

		// iterating using for loop

		for (int i = 0; i < students.size(); i++) {
			System.out.println("Name of student  " + (i + 1) + " :" + students.get(i));
		}

		System.out.println(" forward travers-------------------------------------------------");

		// traverse form Arraylist using iterator forward dicrection

		Iterator<String> i = students.iterator();

		while (i.hasNext()) {
			System.out.println("Name of student: " + i.next());

		}
		System.out.println(" backwerad traverse++++++++++++++++++++++++++++++++++++++");

		// traverse form Arraylist using iterator backward dicrection
		ListIterator<String> str = students.listIterator(students.size());
		while (str.hasPrevious()) {
			System.out.println(str.previous());
		}

		System.out.println("---------------------------------------------------");

		// traverse using for each loop

		for (String s : students) {
			System.out.println(s);
		}

		System.out.println("\n ________________traversing using for each method_____________________________");
		// traversing using for each method

		students.forEach(e -> {
			System.out.println(e);
		});

		System.out.println("---------------------------------------------------");

		// setting element name
		// changing name of index 1 and 0
		students.set(1, "harshal");
		students.set(0, "Ashey");

		// removing element from index 3

		students.remove(3);

		System.out.println(students); // manash removed and harshal , Ashey added

		// list can call element with index but set can not have index call
		System.out.println(students.get(2));

		// check Ashey is in students list
		System.out.println(students.contains("Ashey"));

		// check size of students list
		System.out.println(students.size());

	}
}
