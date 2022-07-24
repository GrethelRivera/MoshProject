package com.rivera.algorithms;


import java.util.Scanner;

public class CountSyllables {
    public static int numberSyllables(String word) {
        String[] syl = word.split("-");
        return syl.length;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(numberSyllables("buf-fet")); //2
        System.out.println(numberSyllables("beau-ti-ful"));// 3

    }
}