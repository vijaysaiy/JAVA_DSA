package com.vijay.practice.algorithms.binarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = floor(arr,target);
        System.out.print(ans);
    }
    //return greatest number smaller or equal than target
    static int floor(int[] arr,int target){
        if(target < arr[0]) return -1; // if no element is present will return -1
        int start = 0;
        int end = arr.length-1;
        while( start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
