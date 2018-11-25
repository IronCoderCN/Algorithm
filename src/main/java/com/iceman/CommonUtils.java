package com.iceman;

/**
 * @description: 工具类
 * @author: ICEMAN
 * @date: 2018\11\24 0024  9:23
 * @version: 1.0
 */

public class CommonUtils {

    /**
     * @description :   方法说明
     * @param :         maxSize 最大长度
     * @param :         maxValue 最大值
     * @param :         boolean 是否包含负值
     * @return :        int[] 随机数组
     */
    public static int[] getRandomArray(int maxSize, int maxValue, boolean containNegative) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        if (containNegative){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) ((maxValue + 1) * Math.random());
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j){
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
