package cn.lq.c_lq;

import java.util.Scanner;
/*��������
���������������� a, b, c�����һ�������Ȳ��� a ��������Ҳ���� b �������������� c �������������������Ϊ��������
���������� 1 �� n ���ж��ٸ���������
�����ʽ
��������ĵ�һ�а���һ������ n��
�����ڶ��а����������� a, b, c������������֮����һ���ո�ָ���
�����ʽ
�������һ�а���һ����������ʾ�𰸡�
��������
30
2 3 6
�������
10
����˵��
����������Щ������Ҫ��1, 5, 7, 11, 13, 17, 19, 23, 25, 29��
����������ģ��Լ��
�������� 40% ������������1 <= n <= 10000��
�������� 80% ������������1 <= n <= 100000��
����������������������1 <= n <= 1000000��1 <= a <= n��1 <= b <= n��1 <= c <= n��*/
public class Main40 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if (i%a!=0&&i%b!=0&&i%c!=0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
