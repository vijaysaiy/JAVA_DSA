package com.vijay.functions;

public class MethodOverloading {
    // same function names can be used as long as the type of arguments are different
    public static void main(String[] args) {
        fun(2);
        fun("vijay");
        int ans = sum(1,2);
        System.out.println(ans);
        int ans2 = sum(1,2,3);
        System.out.println(ans2);
    }
    static int sum(int a,int b){
        return a + b;
    }
    static int sum(int a,int b,int c){
        return a + b + c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
