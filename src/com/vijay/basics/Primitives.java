package com.vijay.basics;
/*
---------Primitive Data Types-----------
*  Data types which cannot be broken down further
    Ex:int,float,long,char,double.boolean
    ->by default all decimal numbers are double
    ->so if you want to save it as float add f or F at the end;
    ->by default all numbers are of int type
    ->so if you want to save it as long,add l or L at the end
---------Non Primitive Data Types--------
* Data types which can be broken down further
    Ex:A String can be broken down into characters
-----------Literals and Identifiers-------
* int a = 10;
->Here 10 is literal and a is identifier
*/

public class Primitives {
    public static void main(String[] args) {
        int rollNo = 64;
        char letter = 'v';
        float marks = 98.67f;
        double largeDecimalNumbers = 45678342.564;
        long largeInteger = 3429834791738732L;
        boolean isAvailable = false;
        //to write in a thousand format
        int num = 200_100_100;
        System.out.println(rollNo+" "+letter+" "+marks+" "+largeInteger+" "+largeDecimalNumbers +" "+ isAvailable);
    }
}
