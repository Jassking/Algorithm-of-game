package cn.example.lqb.c2017;

import java.util.Scanner;

/*9. 分巧克力

    儿童节那天有K位小朋友到小明家做客。小明拿出了珍藏的巧克力招待小朋友们。
    小明一共有N块巧克力，其中第i块是Hi x Wi的方格组成的长方形。

    为了公平起见，小明需要从这 N 块巧克力中切出K块巧克力分给小朋友们。切出的巧克力需要满足：

    1. 形状是正方形，边长是整数
    2. 大小相同

例如一块6x5的巧克力可以切出6块2x2的巧克力或者2块3x3的巧克力。

当然小朋友们都希望得到的巧克力尽可能大，你能帮小Hi计算出最大的边长是多少么？

输入
第一行包含两个整数N和K。(1 <= N, K <= 100000)
以下N行每行包含两个整数Hi和Wi。(1 <= Hi, Wi <= 100000)
输入保证每位小朋友至少能获得一块1x1的巧克力。

输出
输出切出的正方形巧克力最大可能的边长。

样例输入：
2 10
6 5
5 6

样例输出：
2

资源约定：
峰值内存消耗（含虚拟机） < 256M

CPU消耗  < 1000ms

【解析】：从1开始遍历，直到查找到不能分的最小数量，输出最小数量减一即为可以分到的最大值*/
public class Main6 {
    static int h[] = new int[100000];
    static int w[] = new int[100000];
    static int n, k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int max;
        for (max = 1;; max++)//每个人最少可以分1块，最大边从1开始试
            if (check(max) < k) {//出现分割不够的情况，则上一次是可以分割的最大数目
                System.out.println(max - 1);
                break;
            }
    }
    private static long check(int max) {//计算总共可以分为几块
        long sum = 0;
        for (int i = 0; i < n; i++)
            sum += (long) (h[i] / max) * (long) (w[i] / max);
        return sum;
    }
}
