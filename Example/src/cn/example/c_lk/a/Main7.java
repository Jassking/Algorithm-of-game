package cn.example.c_lk.a;

import java.util.Arrays;
/*82. 落单的数
给出 2 * n + 1个数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
样例
样例 1:
输入：[1,1,2,2,3,4,4]
输出：3
解释：
仅3出现一次
样例 2:
输入：[0,0,1]
输出：1
解释：
仅1出现一次
挑战
一次遍历，常数级的额外空间复杂度*/
public class Main7 {
    public int singleNumber(int[] A) {
        if (A.length == 1) {//判断数组A只有一个数值
            return A[0];
        }
        Arrays.sort(A);//将数组A进行排序
        for (int i = 0; i < A.length - 1; i += 2) {
            //只判断当前两个数值是否相等，下一次是判断下一组的两个数值是否相等，所以i+=2
            if (A[i] == A[i + 1]) {//相等就跳出本次循环

            } else {
                return A[i];//否则输出这个数字
            }
        }
        int len = A.length;
        //防止最后一位数值是单个数值
        if (A[len - 1] == A[len - 2]) {

        } else {
            return A[len - 1];//否则输出这个数字
        }
        return 1;
    }
}
