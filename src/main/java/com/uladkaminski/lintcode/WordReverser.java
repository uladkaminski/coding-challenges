package com.uladkaminski.lintcode;

public class WordReverser {
    public String reverseWords(String s) {
        s = s.replaceAll("( )+", " ");
        String result = "";
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            result = result +  words[i] + " ";
        }
        return result.trim();
    }
}
