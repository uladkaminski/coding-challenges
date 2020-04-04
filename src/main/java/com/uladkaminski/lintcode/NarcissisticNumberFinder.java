package com.uladkaminski.lintcode;

import java.util.ArrayList;
import java.util.List;

public class NarcissisticNumberFinder {
    public static List<Integer> getNarcissisticNumbers(int n) {
        List<Integer> result = new ArrayList<>();
        int start = (int) Math.pow(10, n-1);
        int finish = (int) Math.pow(10, n);

        for (int i = start; i < finish; ++i) {
            if (i == splitAndPower(i, n)){
                result.add(i);
            }
        }

        return result;
    }



    public static int splitAndPower(int i, int n) {
        int temp = i;
        int result = 0;
        for (int k = 0; k<n ;++k ){
            i = temp%10;
            temp = temp/10;

            result += Math.pow(i, n);
        }
        return result;
    }
}
