import java.util.*;
class Student implements Comparable<Student>{
	int rollNo, age;
	String name;
	
	public Student(int rollNo,String name, int age ) {
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
	
	public  String toString() {
		return rollNo + " " +  name + " " + age; 
	}
}
public class Task24 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(103,"Ajay",22),
				new Student(101, "khushi", 21),
				new Student(104, "ritesh", 23));
		Collections.sort(students);
		
		System.out.println("sorted by name : " + students);
		
		students.sort(Comparator.comparingInt(s -> s.age));
		
		System.out.println("sorted by rollNo : " + students);
		
		new Thread(() -> printNumbers(2)).start(); 
		
		new Thread(() -> printNumbers(1)).start(); 

	}

	static void printNumbers(int start) {
		for(int i = start; i<= 10; i+= 2) {
			System.out.println((start % 2 == 0 ? "even" : "odd" ) + i);
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
			
			}
		}
	}

}
