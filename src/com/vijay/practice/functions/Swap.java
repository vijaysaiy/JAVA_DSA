package com.vijay.practice.functions;

public class Swap {
    public static void main(String[] args) {
        swap(1,2);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
