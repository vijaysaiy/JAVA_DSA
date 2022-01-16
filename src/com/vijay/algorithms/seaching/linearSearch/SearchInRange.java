package com.vijay.algorithms.seaching.linearSearch;

public class SearchInRange {
    public static void main(String[] args){
    int[] arr = {23,34,45,1,2,8,19,-1,16,-11,28};
    int target = 28;
    int ans = linearSearch(arr,target);
        System.out.print(ans);                      // will print -1 as 28 is at index 11
}
//search for target in index[1,4]
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0) return -1;                      //if array is empty

        //search in the array: return the index if target found;otherwise -1
        for(int index = 1; index <= 4; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;              // if none of the above statement do not execute ie target not found
    }
}
