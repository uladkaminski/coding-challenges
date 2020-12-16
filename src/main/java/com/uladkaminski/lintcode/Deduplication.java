package com.uladkaminski.lintcode;

public class Deduplication {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        if (nums.length > 0) {
            int j = nums.length;
            int i = 0;
            while (i < j) {
                int k = i + 1;
                while (k < nums.length && nums[k] < Integer.MAX_VALUE) {
                    if(nums[k] == nums[i]) {
                        nums[k] = Integer.MAX_VALUE;
                        swap(nums, k, --j);
                    } else {
                        k++;
                    }
                }
                ++i;
            }

            int a = 0;
            while(a < nums.length && nums[a] < Integer.MAX_VALUE){
                ++a;
            }
            return a;

        }

        return 0;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
