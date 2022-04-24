package com.vijay.algorithms.seaching.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = -12;
        int ans = binarySearch(arr,target);
        System.out.print(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while( start <= end ){

            // find the mid value
            // mid = (s + e)/2 might exceed int size

            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else{
                return mid; // answer found
            }
        }
        return -1; // if answer not found
    }
}
