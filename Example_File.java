package signimus;

import java.io.*;
import java.util.*;

public class Example_File {

	public static void main(String[] args) throws IOException {
		
		File file = new File("test1.txt");
		Scanner sc = new Scanner(file);
		
		int wordCount = 0;
		while(sc.hasNext()) {
			sc.next();
			wordCount++;
			}
		sc.close();
		
		System.out.println("the no of word in file is : "+ wordCount);
				
	}

}