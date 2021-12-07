package com.vijay.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,912,12,10);
        multiple(2,4,"Vijay","suraj","anil");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b , String ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
