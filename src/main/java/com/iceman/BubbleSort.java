package main.java.com.iceman;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int number : arr) {
            System.out.print(number);
        }
        System.out.println();
        swap(arr, 0, 1);
        for (int number : arr) {
            System.out.print(number);
        }
    }
    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, arr[j], arr[j + 1]);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
