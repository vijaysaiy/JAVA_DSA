package com.vijay.basics;

/*

 */

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        int x1 =10;
        Integer x2 = x1;    // here Integer is non-primitive, and it was assigned x1, this work perfectly cz x1 is converted to Integer object this is auto boxing
        int x3 = x2; // here Integer object converts to primitive int, this is auto unboxing
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}

/*
    Integer x1 = 400, x2 = 400;
    if(x1 == x2) {
    System.out.println("same");
    } else {
    System.out.println("not same");
    }

    o/p is not same, because Integer is object and objects have their own reference hence x1 and x2 have diff ref hence not same
    if they were int , they would have been same
 */