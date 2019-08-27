package com.iceman.leetcode.array.easy;


/**
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * <p>
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * <p>
 * 说明:
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的原地算法
 */

/**
 * @author :        ICEMAN
 * @version :       1.0
 * @description :   java类作用描述
 * @date :          2019/2/19 21:04
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || k == 0 || k % nums.length == 0) {
            return;
        }
        int buff = 0;
        int i = 0;
        int length = nums.length;
        while (i != k - 1) {
            buff = nums[i];
            nums[i] = nums[(i + k) % length];
            nums[(i + k) % length] = buff;
            i = (i + k) % length;
        }
    }
}
