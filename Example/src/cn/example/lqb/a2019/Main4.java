package cn.example.lqb.a2019;

import java.util.Scanner;

/*
6.特别数的和：

    小明对数位中含有2、0、1、9 的数字很感兴趣（不包括前导0），在1 到
    40 中这样的数包括1、2、9、10 至32、39 和40，共28 个，他们的和是574。
    请问，在1 到n 中，所有这样的数的和是多少？

    输入：

    输入一行包含一个整数n。

    输出：

    输出一行，包含一个整数，表示满足条件的数的和。

    【样例输入】
    40
    【样例输出】
    574
*/
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(check(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean check(int i) {
        char[] s = String.valueOf(i).toCharArray();
        for(int b = 0; b < s.length; b++) {
            if(s[b] == '2' || s[b] == '0' || s[b] == '1' || s[b] == '9') {
                return true;
            }
        }
        return false;
    }
}
