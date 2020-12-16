package com.uladkaminski.lintcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 3, 4, 6, 42, 2, -1};
        new MergeSort().sort(ints);
        System.out.println(Arrays.toString(ints));


        int[] ints1 = {1, 2, 3, 4, 5, 6, 7, 8};
        new MergeSort().sort(ints1);
        System.out.println(Arrays.toString(ints1));
    }
}
