package cn.example.c_zj;

import java.util.ArrayList;

/*53. 最大子序和
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4]
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
进阶:

如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。*/
public class Main6 {
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
    //动态规划https://leetcode-cn.com/problems/maximum-subarray/solution/shi-pin-tu-jie-zui-da-zi-xu-he-by-alchemist-5r/
    public static int maxSubArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            //数组中前一个位置的最优解是否大于零，不大于零则舍弃，用当前位
            nums[i]=Math.max(nums[i],nums[i]+nums[i-1]);
        }
        int ans=nums[0];//取出数组中第一个元素
        for (int i = 1; i < nums.length; i++) {
            //将第一个元素和当前位的最优解结果进行比较
            ans=Math.max(ans,nums[i]);
        }
        return ans;
    }
}
