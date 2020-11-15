package cn.example.lqb.a2019;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
7.���������ȼ���

    ������ô������ϵͳ��ά����N �������꣬���1 N��ÿ�������궼��
    һ�����ȼ�����ʼʱ(0 ʱ��) ���ȼ���Ϊ0��
    ÿ����1 ��ʱ�䵥λ�����������û�ж����������ȼ������1����ͼ�
    ��0��������������ж����������ȼ��������ӣ�ÿ��һ�����ȼ���2��
    ���ĳ��������ĳʱ�����ȼ�����5����ᱻϵͳ�������Ȼ����У����
    ���ȼ�С�ڵ���3����ᱻ��������Ȼ��档
    ����T ʱ�����ڵ�M ��������Ϣ���������T ʱ��ʱ�ж�������������
    �Ȼ����С�

    �������ʽ��
    ��һ�а���3 ������N��M ��T��
    ����M ��ÿ�а�����������ts ��id����ʾts ʱ�̱��id ���������յ�
    һ��������
    �������ʽ��
    ���һ����������𰸡�
    ���������롿
    2 6 6
    1 1
    5 2
    3 1
    6 2
    2 1
    6 2

    �����������
    1

    ���������͡�
    6 ʱ��ʱ��1 �ŵ����ȼ�����3�����Ƴ������Ȼ��棻2 �ŵ����ȼ�����6��
    �������Ȼ��档��������1 �ҵ�(2 ��) �����Ȼ����С�
*/
public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Set<Integer> set = new HashSet<Integer>();
            int N = input.nextInt();
            int M = input.nextInt();
            int T = input.nextInt();
            int[][] orders = new int[M][2];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < 2; j++) {
                    orders[i][j] = input.nextInt();
                }
            }
            int[] priority = new int[N];
            int[] sign = new int[N];
            for (int i = 1; i <= T; i++) {
                for (int j = 0; j < M; j++) {
                    if (orders[j][0] == i) {
                        priority[orders[j][1] - 1] += 2;
                        if (priority[orders[j][1] - 1] > 5 && !set.contains(orders[j][1] - 1)) {
                            set.add(orders[j][1] - 1);
                        }
                        sign[orders[j][1] - 1] = 1;
                    }
                }
                for (int j = 0; j < N; j++) {
                    if (sign[j] == 0 && priority[j] > 0)
                        priority[j]--;
                    if (priority[j] <= 3) {
                        set.remove(j);
                    }
                }
                sign = new int[N];
            }
            System.out.println(set.size());
        } catch (Exception e) {
            input.close();
        }
    }
}
