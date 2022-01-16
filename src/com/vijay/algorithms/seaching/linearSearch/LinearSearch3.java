package com.vijay.algorithms.seaching.linearSearch;

public class LinearSearch3 {
    public static void main(String[] args){
        int arr[] = {23,44,63,1,2,3,4};
        int target = 5;
        int ans = linearSearch(arr,target);
        System.out.print(ans);
    }
    //return the element itself if present otherwise returns maxvalue of integer
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0) return Integer.MAX_VALUE;
        for(int element:arr){
            if(element == target) return element;
        }
        return Integer.MAX_VALUE;
    }

}
