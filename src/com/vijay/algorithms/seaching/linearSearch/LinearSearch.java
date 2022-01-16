package com.vijay.algorithms.seaching.linearSearch;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {23,34,45,1,2,8,19,-1,16,-11,28};
        int target = 2;
        int ans = linearSearch(arr,target);
        System.out.print(ans);                      // will print 4
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0) return -1;                      //if array is empty

        //search in the array: return the index if target found;otherwise -1
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;              // if none of the above statement do not execute ie target not found
    }

}
