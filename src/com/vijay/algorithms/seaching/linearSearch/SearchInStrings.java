package com.vijay.algorithms.seaching.linearSearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args){
        String name = "Vijay";
        char target = 's';
        System.out.println(search2(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str,char target){
        if(str.length() == 0) return false;
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) return true;
        }
        return false;
    }
    //using for-each loop
    static boolean search2(String str,char target){
        if(str.length() == 0) return false;
        for (char ch : str.toCharArray()) { // toCharArray() converts string name = {v,i,j,a,y} array and iterates over this array
            if(target == ch) return true;
        }
        return false;
    }
}
