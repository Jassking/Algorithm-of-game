package cn.example.c_lk.a;
/*83. 落单的数 II
给出3*n + 1 个非负整数，除其中一个数字之外其他每个数字均出现三次，找到这个数字。
样例
样例 1:
输入:  [1,1,2,3,3,3,2,2,4,1]
输出:  4
样例 2:
输入: [2,1,2,2]
输出:  1
挑战
一次遍历，常数级的额外空间复杂度*/
import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        int[] s = {6, 1, 1, 1, 2, 2, 2, 4, 5, 6, 4, 5, 0, 4, 5, 6};
        System.out.println(singleNumber(s));
    }

    public static int singleNumber(int[] A) {
        if (A.length == 1) {//判断数组A只有一个数值
            return A[0];
        }
        Arrays.sort(A);//将数组A进行排序
        for (int i = 0; i < A.length - 2; i += 3) {
            //只判断当前两个数值是否相等，下一次是判断下一组的两个数值是否相等，所以i+=2
            if (A[i] == A[i + 1] && A[i + 1] == A[i + 2]) {//相等就跳出本次循环

            } else {
                return A[i];//否则输出这个数字
            }
        }
        int len = A.length;
        //防止最后一位数值是单个数值
        if (A[len - 1] == A[len - 2] && A[len - 2] == A[len - 3]) {

        } else {
            return A[len - 1];//否则输出这个数字
        }
        return 1;
    }
}
