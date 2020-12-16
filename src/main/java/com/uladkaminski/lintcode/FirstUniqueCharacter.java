package com.uladkaminski.lintcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstUniqueCharacter {

    public int searchInsert(int[] A, int target) {

        int i = 0;
        if (A.length > 0) {
            while (i < A.length && target > A[i]){
                ++i;
            }
        }
        return i;
    }

    public char firstUniqChar(String str) {
        char[] arr = str.toCharArray();
        for (char a : arr) {
            if (isUnique(a, arr, str.indexOf(a))) return a;
        }

        return ' ';
    }

    public boolean isUnique(char a, char[] arr, int i) {
        int result = 0;
        while (result < 2 && i < arr.length) {
            if (a == arr[i]) {
                result++;
            }
            i++;
        }

        return result == 1;

    }


    public boolean isLegalIdentifier(String str) {
        return Pattern.compile("^[a-zA-Z]+").matcher(str.trim()).find();
    }

    public static int count(String s) {
       int result = 0;
        for (String word : s.split(" ")) {
            Matcher matcher = Pattern.compile("([A-Z])").matcher(word.substring(1));
            while (matcher.find()){
                result++;
            }

        }

        Matcher matcher1 = Pattern.compile("[.]([\\s])([a-z])").matcher(s);
        while (matcher1.find()){
            result++;
        }

        return result;
    }

    public int mostFrequentlyAppearingLetters(String str) {
        int max = 0;
        char[] arr = str.toCharArray();
        List<Character> letters = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if (!letters.contains(arr[i])) {
                int count = count(arr[i], arr, i);
                if (max < count) {
                    max = count;
                }

                if (max > arr.length - i) {
                    return max;
                }

                letters.add(arr[i]);
            }
        }


        return max;
    }

    public int count(char a, char[] arr, int indexFrom ) {
        int result = 0;
        int i = indexFrom;
        while ( i < arr.length) {
            if (a == arr[i]) {
                result++;
            }
            i++;
        }

        return result;

    }
}
