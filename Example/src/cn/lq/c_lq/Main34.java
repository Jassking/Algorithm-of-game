package cn.lq.c_lq;

import java.util.Arrays;
import java.util.Scanner;

/*问题描述
　　小明要组织一台晚会，总共准备了 n 个节目。然后晚会的时间有限，他只能最终选择其中的 m 个节目。
　　这 n 个节目是按照小明设想的顺序给定的，顺序不能改变。
　　小明发现，观众对于晚上的喜欢程度与前几个节目的好看程度有非常大的关系，他希望选出的第一个节目尽可能好看，在此前提下希望第二个节目尽可能好看，依次类推。
　　小明给每个节目定义了一个好看值，请你帮助小明选择出 m 个节目，满足他的要求。
输入格式
　　输入的第一行包含两个整数 n, m ，表示节目的数量和要选择的数量。
　　第二行包含 n 个整数，依次为每个节目的好看值。
输出格式
　　输出一行包含 m 个整数，为选出的节目的好看值。
样例输入
5 3
3 1 2 5 4
样例输出
3 5 4
样例说明
　　选择了第1, 4, 5个节目。*/
//        for循环逆序a[i]
//        i >=n-m  选到m个数
//        for (int i = a.length - 1; i >=n- m ; i--) {
//            System.out.print(a[i]+" ");
//        }
public class Main34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a);
        for (int j = 0; j < n; j++) {
            for (int i = a.length - 1; i >= n - m; i--) {
                if (a[i] == b[j]) {
                    System.out.print(b[j] + " ");
                }
            }
        }
    }
}