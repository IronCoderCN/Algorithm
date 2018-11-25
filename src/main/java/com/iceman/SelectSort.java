package com.iceman;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(15, 10, false);
        System.out.println("Before Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After Sort:");
        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    }
    }

    private static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (index != i){
                CommonUtils.swap(arr, i, index);
            }
        }
    }

}
