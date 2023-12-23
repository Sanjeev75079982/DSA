package arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class UnionOfTwoArrays {
    
    //Using HashSet
    public static int unionOfTwoArrays(int arr1[], int arr2[]){
        Set<Integer> union = new HashSet<>();

        for(int a1: arr1) union.add(a1);
        for(int a2: arr2) union.add(a2);

        return union.size();
    }   

    //Using HashMap
    public static int union(int arr1[], int arr2[]){
        Map<Integer, Integer> union = new HashMap<>();

        for(int a: arr1){
            if(union.containsKey(a)) union.put(a, union.get(a)+1);
            else union.put(a, 0);
        }

        for(int a: arr2){
            if(union.containsKey(a)) union.put(a, union.get(a)+1);
            else union.put(a, 0);
        }
        return union.size();
    }
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {1, 4, 6, 9, 5, 7};
        System.out.println(unionOfTwoArrays(arr1, arr2));
        System.out.println(union(arr1, arr2));
    }
}
