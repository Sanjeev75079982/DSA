/*
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
For example, for arr = [1,2,3], the following are all the permutations of 
    arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

    Here, I have just uploaded the function.
*/

package arrays;

public class NextPermutation {

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int start, int end){
        int i = start;
        int j = end;

        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {

        int size = nums.length;
        int separatingIndex = -1;

        //get the index of peak - 1
        for(int i = size - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                separatingIndex = i;
                break;
            }
        }

        //if the separating number hasn't change it indicates the array is in descending order
        if(separatingIndex == -1){
            reverse(nums, 0 , size - 1);
            return;
        }

        //get the imediate bigger element than the element at seperating index and swap them
        for(int i = size - 1; i > separatingIndex; i--){
            if(nums[i] > nums[separatingIndex]){
                swap(nums, separatingIndex, i);
                break;
            }
        }

        //reverse the array after the seperatingIndex till the end of the array
        reverse(nums, separatingIndex+1, size - 1);
    }
    
    
}
