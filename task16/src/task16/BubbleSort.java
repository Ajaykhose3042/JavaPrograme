package task16;
import java.util.*;

public class BubbleSort {
	
	public static void bubbleSort(int [] arr) {
		
		int n = arr.length;
		for (int i = 0; i<n-1; i++) {
			
			for(int j = 0; j< n-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
			
		int [] arr = {12,34,45,43,65,67,89,23};
		bubbleSort(arr);
		System.out.println("Sorted array is : " + Arrays.toString(arr));
	}

}
