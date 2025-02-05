package signimus;

import java.io.*;
class  InvalidAgeException extends Exception{
	
	public InvalidAgeException(String message) {
		super(message);
	}
}

class AgeValidator{
	
	public static void validateAge(int age) throws InvalidAgeException{
		
		if(age < 0) {
		throw new InvalidAgeException("Age cannot be negative");
		}
		
		System.out.println("Vald age :"+ age);
	}
}
public class SimpleException {

	public static void main(String[] args) {
		try {
		int result = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero..");
			
		}
		try {
			
			AgeValidator.validateAge(-5);
		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}

