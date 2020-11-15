package cn.example.lqb.c2017;

import java.util.Scanner;

/*10. k倍区间

给定一个长度为N的数列，A1, A2, ... AN，如果其中一段连续的子序列Ai, Ai+1, ... Aj(i <= j)之和是K的倍数，我们就称这个区间[i, j]是K倍区间。

你能求出数列中总共有多少个K倍区间吗？

输入
-----
第一行包含两个整数N和K。(1 <= N, K <= 100000)
以下N行每行包含一个整数Ai。(1 <= Ai <= 100000)

输出
-----
输出一个整数，代表K倍区间的数目。


例如，
输入：
5 2
1
2
3
4
5

程序应该输出：
6

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 2000ms

【解析】：求区间[l,r]的和是k的倍数的个数。求区间和，我们可以通过前缀和来求出。
我们规定sum[i]表示第1个元素到第i个元素的和。
那么sum[r] - sum[l-1]就是区间[l,r]的和。区间[l,r]的和是k的倍数即(sum[r] - sum[l-1])%k == 0
即sum[r]%k == sum[l-1]%k。
　　那么，我们求出每个前缀和，在求的过程中取模，两个相等的前缀和就能组成一个k倍区间。

       数列 1 2 3 4 5   mod = 2
　　对前1个数的和取模， 为1 之前有0个前缀和取模后为1，个数+0
　　对前2个数的和取模， 为1 之前有1个前缀和取模后为1，个数+1
　　对前3个数的和取模， 为0 之前有0个前缀和取模后为0, 个数+0
　　对前4个数的和取模， 为0 之前有1个前缀和取模后为0，个数+1
　　对钱5个数的和取模， 为1 之前有2个前缀和取模后为1，个数+2

　　到目前为止ans = 4。但是ans应该等于6，因为这样计算后，我们漏掉了前i个数的和取模是k的倍数的情况，
即[0,i]区间和是k的倍数，因此，我们要在ans = 4 的基础上 加上前缀和取模后为0的个数 即ans+2 = 6;*/
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        a[0] = a[0] % k;
        for (int i = 1; i < n; i++)
            a[i] = ((a[i] % k) + a[i - 1]) % k;
        long sum = 0;
        int b[] = new int[n + 1];
        for (int i = 0; i < n; i++)
            sum += b[a[i]]++;
        System.out.println(sum + b[0]);
    }
}
