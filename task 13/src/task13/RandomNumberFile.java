package task13;
import java.io.*;
import java.util.*;
public class RandomNumberFile {

	public static void main(String[] args) {
		String filename = "numbers.txt";
		Random rand = new Random();
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
			for(int i = 0; i< 10; i++){
				int num = rand.nextInt(100);
				
				writer.write(num + "\n");
			}
			
			System.out.println("Random numbers written to file is : ");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		int sum = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
			
			String line ;
			while((line = reader.readLine()) != null) {
				sum += Integer.parseInt(line);
			}
			System.out.println("the sum of number are : " + sum);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
