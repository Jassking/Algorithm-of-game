package cn.example.lqb.c2017;

import java.util.Scanner;

/*
8.包子凑数

小明几乎每天早晨都会在一家包子铺吃早餐。他发现这家包子铺有N种蒸笼，其中第i种蒸笼恰好能放Ai个包子。
每种蒸笼都有非常多笼，可以认为是无限笼。

每当有顾客想买X个包子，卖包子的大叔就会迅速选出若干笼包子来，使得这若干笼中恰好一共有X个包子。
比如一共有3种蒸笼，分别能放3、4和5个包子。当顾客想买11个包子时，大叔就会选2笼3个的再加1笼5个的
（也可能选出1笼3个的再加2笼4个的）。

当然有时包子大叔无论如何也凑不出顾客想买的数量。比如一共有3种蒸笼，分别能放4、5和6个包子。
而顾客想买7个包子时，大叔就凑不出来了。

小明想知道一共有多少种数目是包子大叔凑不出来的。

输入
----
第一行包含一个整数N。(1 <= N <= 100)
以下N行每行包含一个整数Ai。(1 <= Ai <= 100)

输出
----
一个整数代表答案。如果凑不出的数目有无限多个，输出INF。

例如，
输入：
2
4
5

程序应该输出：
6

再例如，
输入：
2
4
6

程序应该输出：
INF

样例解释：
对于样例1，凑不出的数目包括：1, 2, 3, 6, 7, 11。
对于样例2，所有奇数都凑不出来，所以有无限多个。*/
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[101];

        for (int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        int yueshu = a[1];
        for (int i = 2; i <= n; i++) {
            yueshu = yue(yueshu, a[i]);
        }
        if (yueshu != 1) {
            System.out.println("INF");
        } else {
            boolean dp[] = new boolean[10010];
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j + a[i] <= 10000; j++) {
                    if (dp[j]) {
                        dp[j + a[i]] = true;
                    }
                }
            }
            int sum = 0;
            for (int i = 0; i <= 10000; i++)
                if (dp[i] == false)
                    sum++;
            System.out.println(sum);
        }
    }

    private static int yue(int x, int y) {
        if (y == 0)
            return x;
        else
            return yue(y, x % y);
    }
}
