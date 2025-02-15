package task16;
import java.util.*;

public class SelectionSort {
	
	public static void selectionSort(int [] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1 ; i++) {
			int minIndex = i;
			for(int j = i + 1; j<n;j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex]= arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		
		int [] arr = {32,44,23,54,67,88,76,99,12};
		selectionSort(arr);

		System.out.println("Selecttioon sort is "+ Arrays.toString(arr));
	}

}
