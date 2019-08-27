package com.iceman.leetcode.array.easy;


/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */

import java.util.Arrays;

/**
 * @description :   java类作用描述
 * @author :        ICEMAN
 * @date :          2019/2/19 21:41
 * @version :       1.0
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        String sss = "";
        sss.trim();
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length-1 || nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        char buff= ' ';
        char[] xx = new Integer(525).toString().toCharArray();
        Integer.parseInt(xx.toString());
        return nums[nums.length-1];
    }
    public int[] plusOne(int[] digits) {
        if(digits.length == 0){
            return digits;
        }
        int index = digits.length-1;
        digits[index]++;
        while(index-1>0){
            if(digits[index] == 10){
                digits[index] =0 ;
                digits[index-1] ++;
                index--;
            }else
                break;
        }
        return digits;
    }

}
