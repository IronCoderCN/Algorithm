package com.iceman;


import java.util.Arrays;

/**
 * @description :   数组实现栈
 * @author :        ICEMAN
 * @version :       1.0
 * @date :          2018\11\25 0025 18:40
 */
public class ArrayStack {

    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(10, 10, false);
        System.out.println("Original Array:");
        ArrayStack arrayStack = new ArrayStack(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            arrayStack.push(arr[i]);
        }
        System.out.println();
        System.out.println("Stack start pop:");

        for (int i = 0; i <= arr.length; i++) {
            System.out.println("Stack size: " + arrayStack.pop());
        }
    }

    private int[] arr;
    private int size;

    public ArrayStack(int arraySize) {
        if (arraySize < 0) {
            throw new RuntimeException("Array size can not be negative!");
        }
        arr = new int[arraySize];
        size = 0;
    }

    public int pop() {
        if (size > 0) {
            return arr[--size];
        } else {
            throw new IndexOutOfBoundsException("Array is empty!");
        }
    }

    public int peek() {
        if (size > 0) {
            return arr[size - 1];
        } else {
            throw new IndexOutOfBoundsException("Array is empty!");
        }
    }

    public void push(int num) {
        if (size < arr.length) {
            arr[size++] = num;
        } else {
            throw new IndexOutOfBoundsException("Array is full!");
        }
    }
}
