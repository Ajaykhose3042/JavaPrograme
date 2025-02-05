package signimus;

public class MinMax {

	public static void main(String[] args) {
		
		
		int [] arr = {21,3,45,6,77,8};
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<=arr.length -1; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
				
			}
			if(arr[i]< min)
			{
				min = arr[i];
				
			}
				
		}
		
		System.out.println("The maximum element in array is  "+ max);
		System.out.println("The minimum element in array is  "+ min);

		
		


	}

}
