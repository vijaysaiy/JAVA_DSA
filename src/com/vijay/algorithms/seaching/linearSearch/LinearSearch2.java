package com.vijay.algorithms.seaching.linearSearch;

public class LinearSearch2 {
    public static void main(String[] args){
        int arr[] = {23,12,34,5,7,5,-3,2};
        int target = 5;
        boolean ans = linearSearch(arr,target);
        System.out.print(ans);
    }
    //return true if present otherwise false
    static boolean linearSearch(int[] arr,int target){
        if(arr.length == 0) return false;
        for(int element : arr){
            if(element == target) return true;
        }
        return false;
    }
}
