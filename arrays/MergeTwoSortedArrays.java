package arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public void mergeArrays(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        int i = n - 1;
        int j = 0;

        while(i >= 0 && j < m){
            if(arr1[i] > arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            }
            else break;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String args[]){
        MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
        int arr[] = {2, 5, 6, 20};
        int array[] = {0, 1, 7, 21};
        Utils.print(arr, "First sorted array");
        Utils.print(array, "Second sorted array");
        obj.mergeArrays(arr, array);
        Utils.print(arr, "After merge First array");
        Utils.print(array, "After merge Second array");
    }
}
