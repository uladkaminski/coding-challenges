package com.uladkaminski.lintcode;

public class MergeSort {

    public void sort(int[] arr) {
        if (arr.length > 1) {
            mergeSort(arr, arr.length);
        }
    }

    private void mergeSort(int[] arr, int high) {
        if (high < 2) {
            return;
        }
        int mid = high / 2;

        int[] left = new int[mid];
        int[] right = new int[high - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, high - mid);

        mergeSort(left, mid);
        mergeSort(right, high - mid);

        merge(arr, left, right, mid, high - mid);

    }

    private void merge(int[] arr, int[] left, int[] right, int m1, int m2) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m1 && j < m2) {
            if (left[i] >= right[j]) {
                arr[k] = right[j];
                j++;
            } else {
                arr[k] = left[i];
                i++;
            }
            k++;
        }

        while (i < m1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < m2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
