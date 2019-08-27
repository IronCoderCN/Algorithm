package com.iceman.leetcode.array.easy;

/**
 * 从排序数组中删除重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 */

 /**
  * @description :   java类作用描述
  * @author :        ICEMAN
  * @date :          2019/2/19 20:29
  * @version :       1.0
  */
public class RemoveDuplicateFromSortedArray {
     public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int size = 0;
         for (int i = 0; i < nums.length; i++) {
             if (nums[i]!=nums[size]){
                 size++;
                 nums[size] = nums[i];
             }
         }
         return size+1;
     }
}
