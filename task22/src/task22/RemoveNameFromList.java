package task22;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveNameFromList {

	public static void main(String[] args) {
		
		ArrayList<String> student = new ArrayList<String>();
		student.add("Ajay");
		student.add("Khishi");
		student.add("Suraj");
		student.add("Jaysri");
		student.add("Chotu");
		student.add("Nishad");
		
		System.out.println("List of student is : " );
		Iterator<String> iterator = student.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.hasNext());
		}
		iterator = student.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			if(name.startsWith("a")){
				iterator.remove();
			}
			if(name.startsWith("A")) {
				iterator.remove();
			}
		}
		
		System.out.print("\n Updated student list after removing the name start with A ");
		for(String students : student) {
			System.out.println(students);
		}
	}

}
