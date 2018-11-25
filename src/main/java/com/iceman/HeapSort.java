package com.iceman;


/**
 * @author :        ICEMAN
 * @version :       1.0
 * @description :   堆排序
 * @date :          2018\11\24 0024 17:06
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(10, 10, false);
        System.out.println("Before Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After Sort:");
        //构建大数堆
        buildBigNumHeap(arr);
        //排序
        int heapSize = arr.length;
        CommonUtils.swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            CommonUtils.swap(arr, 0, --heapSize);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void buildBigNumHeap(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            while (arr[i] > arr[(i - 1) / 2]) {
                CommonUtils.swap(arr, i, (i - 1) / 2);
                i = (i - 1) / 2;
            }
        }
    }

    private static void heapify(int[] arr, int index, int heapSize) {
        int largest = 0;
        int leftSon = index * 2 + 1;
        while (leftSon < heapSize) {
            largest = leftSon + 1 < heapSize && arr[leftSon + 1] > arr[leftSon] ? leftSon + 1 : leftSon;
            if (arr[largest] > arr[index]) {
                CommonUtils.swap(arr, largest, index);
                index = largest;
                leftSon = 2 * index + 1;
            } else {
                break;
            }
        }
    }
}
