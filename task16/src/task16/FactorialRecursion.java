package task16;

public class FactorialRecursion {
	
	public static int factorial(int  n) {
		if(n == 0 || n == 1) {
			
			return 1;
		}
		return n * factorial(n - 1);
	}
	public static void main(String[] args) {
		int num = 5;
		System.out.println("factorial of "+ num + "is : " + factorial(num));
		
	}

}
