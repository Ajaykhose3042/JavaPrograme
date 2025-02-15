package task17;
import java.util.*;

public class ReverseString {
	public static String reverseString(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			stack.push(ch);
		}
		
		StringBuilder reversed = new StringBuilder();
		while(!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		
		return reversed.toString();
	}
	public static void main(String[] args) {
		
		String input = "hellow";
		
		System.out.println("original string iss : "+ input);
		System.out.println("reversed string iss : "+ reverseString(input));

	}

}
