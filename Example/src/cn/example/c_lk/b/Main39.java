package cn.example.c_lk.b;

import java.util.Arrays;
import java.util.Stack;
/*136. 只出现一次的数字
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
说明：
你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
示例 1:
输入: [2,2,1]
输出: 1
示例 2:
输入: [4,1,2,1,2]
输出: 4*/
public class Main39 {

    public static void main(String[] args) {
        int num[]={1,2,2};
        System.out.println(singleNumber(num));
    }
    //解法一：异或运算
    public static int singleNumber(int[] nums) {
        int sum=0;
        for (int ans:nums) {
            sum=sum^ans;
        }
        return sum;
    }
    //利用stack的特性
//    public static int singleNumber(int[] nums) {
//        Stack stack=new Stack();
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            stack.push(nums[i]);
//            if (!stack.isEmpty()) {
//                if (stack.peek().equals(nums[i+1])){
//                    stack.pop();
//                    i+=1;
//                }else{
//                    int sum= (int) stack.pop();
//                    return sum;
//                }
//            }
//        }
//        if (stack.isEmpty()){
//            return nums[nums.length-1];
//        }
//        return -1;
//    }
}
