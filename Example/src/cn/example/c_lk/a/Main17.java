package cn.example.c_lk.a;

import java.util.ArrayList;
import java.util.List;
/*水仙花数的定义是，这个数等于他每一位数上的幂次之和 见维基百科的定义

比如一个3位的十进制整数153就是一个水仙花数。因为 153 = 13 + 53 + 33。

而一个4位的十进制数1634也是一个水仙花数，因为 1634 = 14 + 64 + 34 + 44。

给出n，找到所有的n位十进制水仙花数。

你可以认为n小于8。
样例

样例 1:

输入: 1
输出: [0,1,2,3,4,5,6,7,8,9]

样例 2:

输入:  2
输出: []
样例解释: 没有2位数的水仙花数。
*/
public class Main17 {
    public static void main(String[] args) {
        System.out.println(getNarcissisticNumbers(4));
    }
    public static List<Integer> getNarcissisticNumbers(int n) {
        List<Integer> list=new ArrayList<>();
        int base=1;
        if (n==1){//当n==1时，是一位数
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
            return list;
        }
        while (n!=1){//循环判断几位数的初始化（n==3,base=1000,从1000开始计算）
            --n;
            base*=10;
        }
        for (int i = base; i < base*10; i++) {
            if (pow(i)){//判断是否是水仙花数
                list.add(i);
            }
        }
        return list;
    }

    private  static boolean  pow(int i) {
        String string=String.valueOf(i);
        char[] chars = string.toCharArray();
        int sum=0;
        for (int j = 0; j < chars.length; j++) {
            sum+=(int)Math.pow(chars[j]-'0',chars.length);//Math.pow(x,y)可返回 x 的 y 次幂的值。
        }
        if (sum==i){//判断每一位数相加是否等于i
            return true;
        }
        return false;
    }
}
