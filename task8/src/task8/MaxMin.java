package task8;
import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		int [] arr = {12,23,34,6,76,55};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] < min ) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
				
			}
		}
		
		System.out.println("The maximim element of array is : " + max);
		System.out.println("The minimum element of array is : " + min);

	}

}
