package com.vijay.algorithms.seaching.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] arr2 = {99,80,75,22,11,10,5,2,-3};
        int target = 11;
        int ans = orderAgnosticBS(arr2,target);
        System.out.print(ans);
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        //find whether array is ascending sorted or descending sorted
        boolean isAscending = arr[start] < arr[end];

        while( start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            if(isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
