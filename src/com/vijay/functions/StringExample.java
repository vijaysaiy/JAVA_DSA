package com.vijay.functions;

public class StringExample {
    public static void main(String[] args) {
        String name = "vijay";
        String message = greet(name);
        System.out.println(message);
    }
    static String greet(String name){

        String greeting = "Hello " + name + ",How are you?";
        return greeting;
    }
}



