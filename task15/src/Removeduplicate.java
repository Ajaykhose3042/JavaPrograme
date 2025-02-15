import java.util.ArrayList;
import java.util.HashSet;
public class Removeduplicate {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraList = new ArrayList<Integer>();
		arraList.add(10);
		arraList.add(20);
		arraList.add(30);
		arraList.add(10);
		arraList.add(50);
		arraList.add(20);
		
		HashSet<Integer> uniqueNumber = new HashSet<Integer>(arraList);
		
		System.out.println("List After removing duplicate  : "+ uniqueNumber);
		
		
	}

}
