package cn.lq.a_lq;
/*1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。*/
public class Main13 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int j = i % 10;//个位
            int k = (i % 100) / 10;//十位
            int n = (i % 1000) / 100;//百位
            int m = i / 1000;//千位
            if (j == m && k == n) {
                System.out.println(i);
            }
        }
    }
}

