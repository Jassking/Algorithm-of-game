package cn.lq.c_lq;

import java.util.Scanner;

/*С����֪���������������������������е�������
����1. ��һ��Ϊ n��
����2. �ڶ������ n��
����3. �ӵ����ʼ��ÿһ��С��ǰ����Ĳ�ľ���ֵ��
��������㣬���ڸ����� n���ж������������������С�
�����ʽ
��������һ�а���һ������ n��
�����ʽ
�������һ����������ʾ�𰸡��𰸿��ܴܺ�������𰸳���10000��������*/
public class Main33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            f(n, i);
        }
        System.out.println(count);
    }
    static int count = 0;

    public static void f(int n, int i) {
        count = (count + 1) % 10000;
        if (Math.abs(n - i) <= 1) {
            return;
        }
        for (int j = 1; j < Math.abs(n - i); j++) {
            f(i, j);
        }
        return;
    }
}
