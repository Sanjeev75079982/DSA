package arrays;

public class segregatePositiveAndNegative {
    
    public static void segregatePosAndNeg(int array[]){
        int low = 0;
        int high = array.length -1 ;
        int mid = 0;

        while(mid <= high){
            if(array[mid] >= 0){
                Sort012.swap(array, high, mid);
                high--;
            }
            else {
                Sort012.swap(array, low, mid);
                low++;
                mid++;
            }
        }

    }

    public static void main(String args[]){
        int array[] = {-4, 0, 6, -2, 7, 9, -3};
        Utils.print(array, "Input Array");
        segregatePosAndNeg(array);
        Utils.print(array, "Segregated Array");
    }
}
