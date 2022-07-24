package com.rivera.algorithms;
import java.util.Scanner;

/**
 * Created By: Grethel Rivera
 * Create a function that takes two arguments.
 * Both arguments are integers, a and b. Return true if one of them is 10 or if their sum is 10.
 */

public class TwoMakesTen {
    public static boolean makes10(int a  , int b)
    {
        return (a + b == 10 || a == 10 || b == 10);

    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(makes10(s.nextInt(),s.nextInt()));

    }
}
