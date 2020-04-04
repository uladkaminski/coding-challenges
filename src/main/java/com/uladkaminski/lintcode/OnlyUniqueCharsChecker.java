package com.uladkaminski.lintcode;

public class OnlyUniqueCharsChecker {

    public static boolean isUnique(String str) {
        if (str.length() > 1) {
            for(int i =0; i < str.length(); ++i){
                int oldLength = str.length();
                String newStr = str.replace(String.valueOf(str.charAt(i)), "");
                if (++oldLength != newStr.length()) return false;
            }
        }

        return true;

    }

}
