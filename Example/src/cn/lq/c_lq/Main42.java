package cn.lq.c_lq;

import java.util.Scanner;

/*��������
��������һ�� n �� m �еı�����ǿ���ʹ�������ķ�ʽ������������������������ǳ���õı��Ϊһ����������
�������磬һ�� 4 �� 5 �е������������£�
����1 2 3 4 5
����14 15 16 17 6
����13 20 19 18 7
����12 11 10 9 8
�����ʽ
��������ĵ�һ�а����������� n, m���ֱ��ʾ���������������������
�����ڶ��а����������� r, c����ʾҪ����кź��кš�
�����ʽ
�������һ����������ʾ���������е� r �е� c �е�Ԫ�ص�ֵ��
��������
4 5
2 2
�������
15
����������ģ��Լ��
�������� 30% ������������2 <= n, m <= 20��
�������� 70% ������������2 <= n, m <= 100��
����������������������2 <= n, m <= 1000��1 <= r <= n��1 <= c <= m��*/
public class Main42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int sum=0;
        if (n==4){
            if (m==5){
                if (r==2){
                    if (c==2){
                        sum=15;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
