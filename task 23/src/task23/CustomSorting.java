package task23;
import java.util.*;

class Student implements Comparable<Student>{
	String firstName;
	String lastName;
	int age;
	int height;
	
	public Student(String firstName, String lastName, int age, int height) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.age, other.age);
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + "( Age :  " + age + ", Height : " + height + "m)"; 
	}
}
public class CustomSorting {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Ajay", "khose", 23, 174));
		students.add(new Student("Khushabu", "jain", 23, 160));
		students.add(new Student("bhushan", "patil", 23, 170));
		students.add(new Student("vivek", "patil", 23, 172));
		students.add(new Student("ritesh", "patil", 23, 174));
		
		Collections.sort(students);
		System.out.println("Sorted by  Age (Natural order) : ");
		for(Student s : students) {
			System.out.println(s);
		}
		
		Comparator<Student> secondCharComparator = (s1, s2)->{
			if(s1.firstName.length() > 1 && s2.firstName.length() > 1) {
				return Character.compare(s1.firstName.charAt(1), s2.firstName.charAt(1));
			}
			return 0 ;
		};
		
		Collections.sort(students, secondCharComparator);
		System.out.println("\n sorted by 2nd character of first name :");
		for(Student s : students) {
			System.out.println(s);
		}

	}

}
