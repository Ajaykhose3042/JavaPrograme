package task22;
import java.util.ListIterator;
import java.util.LinkedList;

public class ListIteratorExample {

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<String>();
		cities.add("Jalgaon");
		cities.add("Mumbai");
		cities.add("Nashik");
		cities.add("Pune");
		cities.add("Bangalore");
		
		System.out.println("Cities in forward order : ");
		ListIterator<String> listIterator = cities.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.hasNext());
		}
		
		listIterator = cities.listIterator(cities.size());
		
		
		System.out.println("Cities in backword order : ");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.hasPrevious());
		}
	}

}
