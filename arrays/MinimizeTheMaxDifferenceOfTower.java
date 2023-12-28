package arrays;

import java.util.Arrays;

public class MinimizeTheMaxDifferenceOfTower {
    
    public static int minimumDifference(int arr[], int k){
        int n = arr.length;
        Arrays.sort(arr);
        int minHeight = arr[0];
        int maxHeight = arr[n - 1];
        int res = maxHeight - minHeight;

        for(int i = 1; i < arr.length; i++){
            maxHeight = Math.max(arr[i-1] + k, arr[n-1] - k);
            minHeight = Math.min(arr[0] + k, arr[i] - k);
            
            res = Math.min(res, maxHeight - minHeight);
        }
        return res;
    }

    public static void main(String args[]){
        int arr[] = {6,8,9,19,20};
        System.out.println(minimumDifference(arr, 2));
    }
}
