package arrays;

public class MaxAndMin {
	
	public static void minMax(int arr[]) {
		if(arr.length == 0) {
			System.out.println("Empty array");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
			else {
				if(min > arr[i])
					min = arr[i];
			}
		}
		
		System.out.println("Max = "+max+" Min = "+min);
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,4,-1,7,10,0};
		minMax(arr);
	}
}
