package arrays;

public class Sort012 {
	//this method uses extra space to segregate 0s,1s and 2s
	public static void usingExtraSpace(int arr[]) {

		int countZero = 0;
		int countOne = 0;
		int countTwo = 0;
		
		for(int a: arr) {
			if(a == 0)
				countZero++;
			else if(a == 1)
				countOne++;
			else
				countTwo++;
		}
		System.out.println(countZero +" "+countOne+" "+countTwo);
		int[] newArr = new int[arr.length];
		
		int k = 0;
		
		while(countZero>0) {
			newArr[k++] = 0;
			countZero--;
		}
		
		while(countOne>0) {
			newArr[k++] = 1;
			countOne--;
		}
		
		while(countTwo>0) {
			newArr[k++] = 2;
			countTwo--;
		}
		
		for(int i : newArr)
			System.out.print(i+" ");
		
	}

    public static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void dutchNationalFlag(int array[]){
        int low = 0;
        int mid = 0;
        int high = array.length - 1;

        while(mid <= high){
            if(array[mid] == 0){
                swap(array, low, mid);
                low++;
                mid++;
            }
            else if(array[mid] == 2){
                swap(array, mid, high);
                high--;
            }
            else{
                mid++;
            }
        }
        
    }
	
	public static void main(String args[]) {
		int arr[] = {1,1,1,0,2,0,2};
		int arr2[] = {2,1,0,1,0,2};
        dutchNationalFlag(arr);
        ReverseArray.print(arr, "Dutch National Flag");
		usingExtraSpace(arr2);
	}

}
