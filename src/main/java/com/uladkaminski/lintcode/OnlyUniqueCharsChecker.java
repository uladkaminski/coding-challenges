package com.uladkaminski.lintcode;

public class OnlyUniqueCharsChecker {

    public boolean isUnique(String str) {
        if (str.length() > 1) {
            char[] uniqueChars = new char[str.length()];
            char[] chars = str.toCharArray();
            for (int i =0 ; i < str.length() ; ++i ) {
                if (arrayContains(chars[i], uniqueChars)) {
                    return false;
                }
                uniqueChars[i] = chars[i];
            }
        }
        return true;
    }

    private boolean arrayContains(char c, char[] arr) {
        for (char a : arr) {
            if (a == c) return true;
        }
        return false;
    }

}
