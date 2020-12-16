package com.uladkaminski.lintcode;

public class MultiSort {
    public int[][] multiSort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][1] > array[j][1]) {
                    swap(array, i, j);
                } else if (array[i][1] == array[j][1]) {
                    if (array[i][0] < array[j][0]) {
                        swap(array, i, j);

                    }
                }
            }

        }

        return array;
    }

    public void swap(int[][] arr, int i, int j) {
        int temp1 = arr[i][0];
        int temp2 = arr[i][1];

        arr[i][0] = arr[j][0];
        arr[i][1] = arr[j][1];

        arr[j][0] = temp1;
        arr[j][1] = temp2;

    }
}
