package task8;
import java.util.Arrays;

public class SumOfArryElement {

	public static void main(String[] args) {
		
		int [] arr = {21,34,56,78,45,33};
		int sum = 0;
		int count = 0;
		for(int i = 0; i< arr.length; i++) {
			sum = sum + arr[i];
			count = count + 1;
		}
		
		System.out.println("The sum of elements is : " + sum);
		
		int average = sum/count;
		
		System.out.println("The average of the array element is : " + average);

	}

}
