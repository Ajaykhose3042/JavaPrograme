package signimus;
import java.io.*;
class Student implements Serializable{
	
	private static final long serialVersionId = 1L;
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
		
	}
}

public class SimpleSerialization {

	public static void main(String[] args) throws ClassNotFoundException {
		String filename = "student.ser";
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			Student student = new Student("Ajay", 85);
			oos.writeObject(student);
			
			System.out.println("serialization succesfull");
			
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			Student student = (Student) ois.readObject();
			System.out.println("deSerialization succesfull");
			
			System.out.println("Name :" +student.name);
			System.out.println("marks : "+student.marks);


			
		}
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
