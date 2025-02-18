package task22;
import java.util.Vector;
import java.util.Enumeration;

public class EnumeartionExample {

	public static void main(String[] args) {
		
		Vector<String> countries = new Vector<String>();
		countries.add("India");
		countries.add("England");
		countries.add("Australia");
		countries.add("New Zealand");
		countries.add("South Africa");
		
		System.out.println("List of the countries is : ");
		
		Enumeration<String> enummeration = countries.elements();
		while(enummeration.hasMoreElements()) {
			
			System.out.println(enummeration.nextElement());
		}
	}

}
