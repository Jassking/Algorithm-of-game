package cn.example.lqb.c2017;
/*2.纸牌三角形

        A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
        下图就是一种排法（如有对齐问题，参看p1.png）。

              A
             9 6
            4   8
           3 7 5 2

        这样的排法可能会有很多。

        如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？

        请你计算并提交该数字。

        注意：需要提交的是一个整数，不要提交任何多余内容。

【解析】：穷举即可，需要注意的是考虑旋转、镜像后相同的算同一种，
顶点可以有三个位置，并且左右对称的话也是相同的一种，因此最后要除以6.*/
public class Main {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h, i;
        int sum = 0;
        for (a = 1; a < 10; a++) {
            for (b = 1; b < 10; b++) {
                for (c = 1; c < 10; c++) {
                    for (d = 1; d < 10; d++) {
                        for (e = 1; e < 10; e++) {
                            for (f = 1; f < 10; f++) {
                                for (g = 1; g < 10; g++) {
                                    for (h = 1; h < 10; h++) {
                                        for (i = 1; i < 10; i++) {
                                            if (a + b + d + f == a + c + e + i
                                                    && a + b + d + f == f + g
                                                    + h + i && a != b
                                                    && a != c && a != d
                                                    && a != e && a != f
                                                    && a != g && a != h
                                                    && a != i && b != c
                                                    && b != d && b != e
                                                    && b != f && b != g
                                                    && b != h && b != i
                                                    && c != d && c != e
                                                    && c != f && c != g
                                                    && c != h && c != i
                                                    && d != e && d != f
                                                    && d != g && d != h
                                                    && d != i && e != f
                                                    && e != g && e != h
                                                    && e != i && f != g
                                                    && f != h && f != i
                                                    && g != h && g != i
                                                    && h != i) {
                                                sum++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println(sum/3/2);
    }
}
