package cn.lq.a_lq;

import java.util.Scanner;

/*
利用字母可以组成一些美丽的图形，下面给出了一个例子：
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
*/
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//行数
        int m=scanner.nextInt();//列数
        int[] a=new int[26];
        //将A-Z放入a[]中
        char s='A';
        for (int i = 0; i < 26; i++) {
            a[i]=s+i;
        }
        //循环
        for (int i = 0; i < n; i++) {//判断第几行
            for (int j = 0; j < m; j++) {//判断第几列
                if (i==j){//当i==j时，a[i]=A
                    System.out.print((char)a[0]);
                }else if (j-i>0){//当j-i>0时，表示A的右边
                    System.out.print((char)a[j-i]);
                }else {//否则都是A的左边
                    System.out.print((char)a[Math.abs(j-i)]);//Math.abs()表示绝对值
                }
            }
            System.out.println();
        }

    }
}
