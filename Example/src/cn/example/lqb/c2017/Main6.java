package cn.example.lqb.c2017;

import java.util.Scanner;

/*9. ���ɿ���

    ��ͯ��������KλС���ѵ�С�������͡�С���ó�����ص��ɿ����д�С�����ǡ�
    С��һ����N���ɿ��������е�i����Hi x Wi�ķ�����ɵĳ����Ρ�

    Ϊ�˹�ƽ�����С����Ҫ���� N ���ɿ������г�K���ɿ����ָ�С�����ǡ��г����ɿ�����Ҫ���㣺

    1. ��״�������Σ��߳�������
    2. ��С��ͬ

����һ��6x5���ɿ��������г�6��2x2���ɿ�������2��3x3���ɿ�����

��ȻС�����Ƕ�ϣ���õ����ɿ��������ܴ����ܰ�СHi��������ı߳��Ƕ���ô��

����
��һ�а�����������N��K��(1 <= N, K <= 100000)
����N��ÿ�а�����������Hi��Wi��(1 <= Hi, Wi <= 100000)
���뱣֤ÿλС���������ܻ��һ��1x1���ɿ�����

���
����г����������ɿ��������ܵı߳���

�������룺
2 10
6 5
5 6

���������
2

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M

CPU����  < 1000ms

������������1��ʼ������ֱ�����ҵ����ֵܷ���С�����������С������һ��Ϊ���Էֵ������ֵ*/
public class Main6 {
    static int h[] = new int[100000];
    static int w[] = new int[100000];
    static int n, k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int max;
        for (max = 1;; max++)//ÿ�������ٿ��Է�1�飬���ߴ�1��ʼ��
            if (check(max) < k) {//���ַָ�������������һ���ǿ��Էָ�������Ŀ
                System.out.println(max - 1);
                break;
            }
    }
    private static long check(int max) {//�����ܹ����Է�Ϊ����
        long sum = 0;
        for (int i = 0; i < n; i++)
            sum += (long) (h[i] / max) * (long) (w[i] / max);
        return sum;
    }
}
