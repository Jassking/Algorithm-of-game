package cn.lq.b_lq;
/*一个正整数如果任何一个数位不大于右边相邻的数位，则称为一个数位递增的数，
例如1135是一个数位递增的数，而1024不是一个数位递增的数。
　　给定正整数 n，请问在整数 1 至 n 中有多少个数位递增的数？*/

import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int w = 0;
        int r = 0;
        for (int i = 1; i <= n; i++) {
            int j = i % 10;//个位
            int k = (i % 100) / 10;//十位
            int q = (i % 1000) / 100;//百位
            int m = (i / 1000) % 10;//千位
            if (i >= 100000) {
                w = (i / 10000) % 10;//万位
                r = i / 100000;//十万位
            } else {
                w = i / 10000;//万位
            }
            if (i < 100 && k <= j) {
                sum++;
            } else if (i >= 100 && i < 1000 && q <= k && k <= j) {
                sum++;
            } else if (i >= 1000 && i < 10000 && m <= q && q <= k && k <= j) {
                sum++;
            } else if (i >= 10000 && i < 100000 && w <= m && m <= q && q <= k && k <= j) {
                sum++;
            } else if (i >= 100000 && i < 1000000 && r <= w && w <= m && m <= q && q <= k && k <= j) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}