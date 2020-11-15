package cn.lq.a_lq;

import java.util.Scanner;

/*

Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。

当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
*/
/* 数据规模与约定
1 <= n <= 1,000,000。*/
public class Main4 {
    private static long afs(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return afs(n - 1) + afs(n - 2);
    }

    public static void main(String[] args) {
        //1.递归法
        /*Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b=afs(a)%10007;
        System.out.println(b);*/

        //2.递推法  自己只能写出递推法去算出大数字1,000,000
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sum = new int[n];//存余数
        if (n == 1 || n == 2) {
            sum[n - 1] = 1;
        } else {
            for (int i = 2; i < n; i++) {
                sum[0] = 1;
                sum[1] = 1;
                sum[i] = (sum[i - 1] + sum[i - 2]) % 10007;
            }
        }
        System.out.println(sum[n - 1]);


    }
}
