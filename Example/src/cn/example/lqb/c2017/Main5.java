package cn.example.lqb.c2017;

import java.util.Scanner;

/*
8.���Ӵ���

С������ÿ���糿������һ�Ұ����̳���͡���������Ұ�������N�����������е�i������ǡ���ܷ�Ai�����ӡ�
ÿ���������зǳ�������������Ϊ����������

ÿ���й˿�����X�����ӣ������ӵĴ���ͻ�Ѹ��ѡ����������������ʹ������������ǡ��һ����X�����ӡ�
����һ����3���������ֱ��ܷ�3��4��5�����ӡ����˿�����11������ʱ������ͻ�ѡ2��3�����ټ�1��5����
��Ҳ����ѡ��1��3�����ټ�2��4���ģ���

��Ȼ��ʱ���Ӵ����������Ҳ�ղ����˿����������������һ����3���������ֱ��ܷ�4��5��6�����ӡ�
���˿�����7������ʱ������ʹղ������ˡ�

С����֪��һ���ж�������Ŀ�ǰ��Ӵ���ղ������ġ�

����
----
��һ�а���һ������N��(1 <= N <= 100)
����N��ÿ�а���һ������Ai��(1 <= Ai <= 100)

���
----
һ����������𰸡�����ղ�������Ŀ�����޶�������INF��

���磬
���룺
2
4
5

����Ӧ�������
6

�����磬
���룺
2
4
6

����Ӧ�������
INF

�������ͣ�
��������1���ղ�������Ŀ������1, 2, 3, 6, 7, 11��
��������2�������������ղ����������������޶����*/
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[101];

        for (int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        int yueshu = a[1];
        for (int i = 2; i <= n; i++) {
            yueshu = yue(yueshu, a[i]);
        }
        if (yueshu != 1) {
            System.out.println("INF");
        } else {
            boolean dp[] = new boolean[10010];
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j + a[i] <= 10000; j++) {
                    if (dp[j]) {
                        dp[j + a[i]] = true;
                    }
                }
            }
            int sum = 0;
            for (int i = 0; i <= 10000; i++)
                if (dp[i] == false)
                    sum++;
            System.out.println(sum);
        }
    }

    private static int yue(int x, int y) {
        if (y == 0)
            return x;
        else
            return yue(y, x % y);
    }
}
