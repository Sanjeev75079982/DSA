package arrays;
import arrays.Utils;

public class ReverseArray {

   
	
	//reverse using loop TC-O(n) SC- O(n)
	public static int[] reverseArray(int arr[]){
		int arrSize = arr.length;
		int[] newArray = new int[arrSize];
		
		for(int i = 0; i < arrSize; i++){
			newArray[i] = arr[arrSize - 1-i];
		}
		return newArray;
	}
	
	//reverse using two pointers method
	public static int[] reverseArrayTwoPointers(int arr[], int startIndex, int endIndex) {
		int temp;
		while(startIndex < endIndex) {
			temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			
			startIndex++;
			endIndex--;
		}
		return arr;
		
	}
	
	//reverse using recursion 
	public static int[] reverseUsingRecursion(int arr[], int startIndex, int endIndex) {
		
		if(startIndex < endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			reverseUsingRecursion(arr, startIndex+1, endIndex-1);
		}
		return arr;
		
	}
	
	
	public static void main(String args[]){
		String layout = "Printing array using ";
		String loop = layout+"loops";
		String twoPointers = layout + "TwoPointers";
		
		int[] arr = {1,2,3,4,5,6,7};
		int[] arr2 = {9,8,7,4,2,1};
		
		Utils.print(reverseArray(arr), loop);
		Utils.print(reverseArrayTwoPointers(arr, 0, arr.length-1), twoPointers);
		reverseUsingRecursion(arr2, 0, arr2.length-1);
		Utils.print(arr2, "Recursion");
			
	}
}
