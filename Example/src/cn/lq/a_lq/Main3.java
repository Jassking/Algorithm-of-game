package cn.lq.a_lq;

import java.util.Scanner;

/*给定圆的半径r，求圆的面积。 */
/* 数据规模与约定
1 <= r <= 10000。 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(String.format("%.7f",Math.PI*a*a));
    }
}
