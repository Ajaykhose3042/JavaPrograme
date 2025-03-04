class Library{
	private int bookAvailable;
	
	public Library(int books) {
		this.bookAvailable = books;
	}
	
	public synchronized void borrowBook(String studentName) {
		while(bookAvailable == 0 ) {
			System.out.println(studentName + " is waiting for a book ");
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		bookAvailable--;
		
		System.out.println(studentName + " borrowed a book . Book left " + bookAvailable);
	}
	
	public synchronized void returnBook(String studentName) {
		bookAvailable++;
		System.out.println(studentName + " returned a book . Books available : " + bookAvailable);
		notify();
	}
}

class Student extends Thread{
	private Library  library;
	private String studentName;
	
	public Student(Library library, String studentName) {
		this.library = library;
		this.studentName = studentName;
	}
	
	public void run() {
		library.borrowBook(studentName);
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		library.returnBook(studentName);
	}
}
public class LibrarySystem {

	public static void main(String[] args) {
		
		Library library  = new Library(2);
		Student s1 = new Student(library, "ajay");
		Student s2 = new Student(library, "khushi");
		Student s3 = new Student(library, "ritesh");
		
		s1.start();
		s2.start();
		s3.start();

	}

}
