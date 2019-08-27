package com.iceman.nowcoder;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(10, 10, false);
        System.out.println("Before Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After Sort:");
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (arr == null || arr.length < 2 || left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSort(arr, left, mid);
        //中线下个位置开始排序
        mergeSort(arr, mid + 1, right);
        merge(arr, mid, left, right);
    }

    private static void merge(int[] arr, int mid, int left, int right) {
        int pLeft = left;
        int pRight = mid + 1;
        int[] buff = new int[right - left + 1];
        int index = 0;
        while (pLeft <= mid && pRight <= right) {
            buff[index++] = arr[pLeft] <= arr[pRight] ? arr[pLeft++] : arr[pRight++];
        }
        while (pLeft <= mid) {
            buff[index++] = arr[pLeft++];
        }
        while (pRight <= right) {
            buff[index++] = arr[pRight++];
        }
        for (index = 0; index < buff.length; index++) {
            arr[left + index] = buff[index];
        }
    }
}
