/*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum

Example 1:
                    Input:
                    N = 5
                    Arr[] = {1,2,3,-2,5}
                    Output:
                    9
                    Explanation:
                    Max subarray sum is 9
                    of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
*/
package arrays;

public class KadaneAlgo {

    //Brute force using two loops
    public static long maxSumSubarray(long arr[]){
        long maxSum = Long.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            long curSum = 0;
            for(int j = i; j < arr.length; j++){
                curSum += arr[j];
                maxSum = Math.max(curSum, maxSum);
            }
        }
        return maxSum;

    }

    //optimal approach
    public static long kandaneAlgo(long arr[]){
        long maxSum = Long.MIN_VALUE;
        long curSum = 0;
        for(long a : arr){
            curSum += a;
            maxSum = Math.max(curSum, maxSum);
            if(curSum < 0) curSum = 0;
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        long arr[] = {-10, -2, -3, -4};
        System.out.println(maxSumSubarray(arr)+" Using brute force");
        System.out.println(kandaneAlgo(arr)+" Using kadane's algo");
    }
}
