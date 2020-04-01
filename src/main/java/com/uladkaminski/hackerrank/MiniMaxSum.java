package com.uladkaminski.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    private static final Scanner scanner = new Scanner(System.in);

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long maxSum = Arrays.stream(arr).mapToLong(Long::valueOf).skip(1L).sum();
        long minSum = Arrays.stream(arr).mapToLong(Long::valueOf).limit(arr.length - 1).sum();
        System.out.printf("%d %d", minSum, maxSum);
    }


    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
