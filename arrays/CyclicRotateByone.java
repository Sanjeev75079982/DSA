/*Given an array, rotate the array by one position in clock-wise direction.

    Example 1:
        Input:
        N = 5
        A[] = {1, 2, 3, 4, 5}
        Output:
        5 1 2 3 4
*/

package arrays;

public class CyclicRotateByone {
    
    public static void rotate(int arr[], int n)
    {
        int temp = arr[n - 1];
        
        //shifting the element by one place from right to left
        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i-1]; 
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr1[] = {3,4,5,6,7,8,9};
        Utils.print(arr1, "Input Array");
        rotate(arr1, arr1.length);
        Utils.print(arr1, "Rotated Array");
    }
}
