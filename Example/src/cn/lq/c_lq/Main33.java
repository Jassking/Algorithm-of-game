package cn.lq.c_lq;

import java.util.Scanner;

/*小明想知道，满足以下条件的正整数序列的数量：
　　1. 第一项为 n；
　　2. 第二项不超过 n；
　　3. 从第三项开始，每一项小于前两项的差的绝对值。
　　请计算，对于给定的 n，有多少种满足条件的序列。
输入格式
　　输入一行包含一个整数 n。
输出格式
　　输出一个整数，表示答案。答案可能很大，请输出答案除以10000的余数。*/
public class Main33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            f(n, i);
        }
        System.out.println(count);
    }
    static int count = 0;

    public static void f(int n, int i) {
        count = (count + 1) % 10000;
        if (Math.abs(n - i) <= 1) {
            return;
        }
        for (int j = 1; j < Math.abs(n - i); j++) {
            f(i, j);
        }
        return;
    }
}
