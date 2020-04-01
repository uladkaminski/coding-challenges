package com.uladkaminski.hackerrank;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class PlusMinus {
    private static final Scanner scanner = new Scanner(System.in);

    static void plusMinus(int[] arr) {
        IntPredicate positivePredicate = i -> i > 0;
        IntPredicate negativePredicate = i -> i < 0;
        IntPredicate zeroPredicate = i -> i == 0;

        Arrays.asList(positivePredicate, negativePredicate, zeroPredicate)
                .forEach(it -> System.out.println(
                        BigDecimal.valueOf(
                                Arrays.stream(arr).filter(it).count() / (double) arr.length)
                                .round(new MathContext(6))
                ));


    }


    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

}
