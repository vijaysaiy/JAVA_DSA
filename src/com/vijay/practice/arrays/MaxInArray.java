package com.vijay.practice.arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,4));
    }
    static int max(int[] arr){

        if(arr.length == 0) return -1;

        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    //work on edge cases here,like array being null
    static int maxRange(int[] arr, int start,int end){

        if(start > end) return -1;

        if(arr == null) return -1;

        int maxVal = arr[start];
        for(int i = start; i < end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
