package com.iceman;


/**
 * @author :        ICEMAN
 * @version :       1.0
 * @description :   数组实现队列
 * @date :          2018\11\25 0025 18:55
 */
public class ArrayQueue {
    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(10, 10, false);

        System.out.println("Original Array:");
        ArrayQueue arrayQueue = new ArrayQueue(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            arrayQueue.push(arr[i]);
        }
        System.out.println();
        System.out.println("ArrayQueue start pop:");

        for (int i = 0; i <= arr.length; i++) {
            System.out.println("ArrayQueue size: " + arrayQueue.pop());
        }
    }

    private int[] arr;
    private int size;
    private int start;
    private int end;


    public ArrayQueue(int arraySize) {
        if (arraySize < 0) {
            throw new RuntimeException("ArrayQueue size can not be negative!");
        }
        arr = new int[arraySize];
        size = 0;
        start = 0;
        end = 0;
    }

    public int pop() {
        if (size > 0) {
            int temp = arr[start];
            start = start ==  arr.length - 1 ? 0 : ++start;
            size--;
            return temp;
        } else {
            throw new IndexOutOfBoundsException("ArrayQueue is empty!");
        }
    }

    public int peek() {
        if (size > 0) {
            return arr[start];
        } else {
            throw new IndexOutOfBoundsException("ArrayQueue is full!");
        }
    }

    public void push(int num) {
        if (size < arr.length) {
            arr[end] = num;
            end = end == arr.length - 1 ? 0 : ++end;
            size++;
        } else {
            throw new IndexOutOfBoundsException("ArrayQueue is full!");
        }
    }
}
