package com.iceman.nowcoder;

/**
 * @description :   冒泡排序
 * @author :        ICEMAN
 * @date :          2018\11\24 0024  10:31
 * @version :       1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(10,10,false);
        System.out.println("Before Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After Sort:");
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    CommonUtils.swap(arr, j, j + 1);
                }
            }
        }
    }

}
