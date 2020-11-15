package cn.lq.a_lq;

import java.util.Scanner;

/*给出n个数，找出这n个数的最大值，最小值，和。*/
/*数据规模与约定
1 <= n <= 10000。*/
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] m = new int[n];
        int[] temp = new int[1];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
            if (n == 1) {
                System.out.println(m[i]);
                System.out.println(m[i]);
                System.out.println(m[i]);
                return;
            }

        }
        for (int i = 0; i < m.length; i++) {
            if (m.length == 2) {
                System.out.println(Math.max(m[0], m[1]));
                System.out.println(Math.min(m[0], m[1]));
                System.out.println(m[0]+m[1]);
                return;
            }
        }

        int j = 0;
        int k = 0;
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > j) {
                j = m[i];
            }
            if (m[i] < k) {
                k = m[i];
            }
            sum = m[i] + sum;
        }
        System.out.println(j);
        System.out.println(k);
        System.out.println(sum);
    }
}
