package com.rivera.algorithms;

/**
 * Created by Grethel Rivera 7/21/22
 * Create a method that takes a string as its argument and returns the string in reversed order.
 */

public class ReverseOrder {
        public static void main(String[] args) {
            String string = "Hello World";
            String reverse = new StringBuffer(string).reverse().toString();
            System.out.println("\nString before reverse: "+string);
            System.out.println("String after reverse: "+reverse);


        }
    }