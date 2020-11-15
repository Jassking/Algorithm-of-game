package cn.lq.a_lq;

import java.util.Scanner;

/*123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。*/
public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        if (e==1){
            return;
        }
        for (int i = 10000; i < 100000; i++) {
            int j = i % 10;//个位
            int k = (i % 100) / 10;//十位
            int n = (i % 1000) / 100;//百位
            int m = (i / 1000) % 10;//千位
            int w = i / 10000;//万位
            if (j == w && k == m) {
                if (j + k + n + m + w == e) {
                    System.out.println(i);
                }
            }
        }
        for (int i = 100000; i < 1000000; i++) {
            int j = i % 10;//个位
            int k = (i % 100) / 10;//十位
            int n = (i % 1000) / 100;//百位
            int m = (i / 1000) % 10;//千位
            int w = (i / 10000) % 10;//万位
            int r = i / 100000;//十万位
            if (j == r && k == w && n == m) {
                if (j + k + n + m + w + r == e) {
                    System.out.println(i);
                }
            }
        }
    }
}
