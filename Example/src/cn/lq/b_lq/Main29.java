package cn.lq.b_lq;
/*һ������������κ�һ����λ�������ұ����ڵ���λ�����Ϊһ����λ����������
����1135��һ����λ������������1024����һ����λ����������
�������������� n������������ 1 �� n ���ж��ٸ���λ����������*/

import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int w = 0;
        int r = 0;
        for (int i = 1; i <= n; i++) {
            int j = i % 10;//��λ
            int k = (i % 100) / 10;//ʮλ
            int q = (i % 1000) / 100;//��λ
            int m = (i / 1000) % 10;//ǧλ
            if (i >= 100000) {
                w = (i / 10000) % 10;//��λ
                r = i / 100000;//ʮ��λ
            } else {
                w = i / 10000;//��λ
            }
            if (i < 100 && k <= j) {
                sum++;
            } else if (i >= 100 && i < 1000 && q <= k && k <= j) {
                sum++;
            } else if (i >= 1000 && i < 10000 && m <= q && q <= k && k <= j) {
                sum++;
            } else if (i >= 10000 && i < 100000 && w <= m && m <= q && q <= k && k <= j) {
                sum++;
            } else if (i >= 100000 && i < 1000000 && r <= w && w <= m && m <= q && q <= k && k <= j) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}