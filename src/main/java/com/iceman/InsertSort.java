package com.iceman;


/**
 * @author :        ICEMAN
 * @version :       1.0
 * @description :   插入排序
 * @date :          2018\11\24 0024 15:53
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(10, 10, false);
        System.out.println("Before Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After Sort:");
        insetSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insetSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
