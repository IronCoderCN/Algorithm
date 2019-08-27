package com.iceman.nowcoder;


/**
 * @author :        ICEMAN
 * @version :       1.0
 * @description :   快排
 * @date :          2018\11\24 0024 10:54
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(10, 10, false);
        System.out.println("Before Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After Sort:");
        quicksort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quicksort(int[] arr, int left, int right) {
        if (arr == null || arr.length < 2) {
            return;
        }
        if (left < right) {
            int[] point = partition(arr, left, right);
            quicksort(arr, left, point[0] - 1);
            quicksort(arr, point[1] + 1, right);
        }

    }

    private static int[] partition(int[] arr, int left, int right) {
        int less = left - 1;
        int big = right;
        int curr = left;
        int temp = arr[right];
        while (curr < big) {
            if (arr[curr] < temp) {
                CommonUtils.swap(arr, ++less, curr++);
            } else if (arr[curr] > temp) {
                CommonUtils.swap(arr, curr, --big);
            } else {
                curr++;
            }
        }
        CommonUtils.swap(arr, big, right);
        return new int[]{less + 1, big};
    }
}
