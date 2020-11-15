package cn.example.b_wy;
/*
小易给定你数字和系数。每次操作你可以将变成或者将变成。问至少几次操作使得。
输入描述:
第一行数据组数，对于每组数据，一行四个整数。
输出描述:
对于每组数据，输出一个数字表示答案
输入例子1:
2
1 5 7 2
3 5 1 2
输出例子1:
1
2
输入例子2:
2
1 15 4 2
12 19 3 2
输出例子2:
3
3
* */
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Long[] a = new Long[t];
        int[] b = new int[t];
        Long[] p = new Long[t];
        int[] q = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = scanner.nextLong();
            b[i] = scanner.nextInt();
            p[i] = scanner.nextLong();
            q[i] = scanner.nextInt();
        }
        for (int i = 0; i < t; i++) {
            ans(a[i], b[i], p[i], q[i]);
        }
    }
    private static void ans(Long a, int b, Long p, int q) {
        boolean afs=true;
        int sum = 0;
        long da;
        while (afs){
            da = a + p;
            ++sum;
            if (da>= b) {
                System.out.println(sum);
                afs=false;
            } else {
                p =p * q;
                da=a;
            }
        }
    }
}
