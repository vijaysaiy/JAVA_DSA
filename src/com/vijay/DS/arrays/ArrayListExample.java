package com.vijay.DS.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        //manually adding elements
//        list.add(67);
//        list.add(59);
//        list.add(5);
//        list.add(2);
//        list.add(20);
//        list.add(21);
//        list.add(22);
//        list.add(23);
//        list.add(24);
//        list.add(25);
//
//        System.out.println(list.contains(2));
//        list.set(0,99);  //updates 0th index with 99
//        list.remove(2); //removes the element at index 2
//        System.out.println(list);

        //input
        for(int i = 0;i < 5; i++){
            list.add(in.nextInt());
        }
        //get item at any index
        for(int i = 0;i < 5; i++){
            System.out.print(list.get(i) + " "); //pass index here,list[index] won't work
        }
    }
}
