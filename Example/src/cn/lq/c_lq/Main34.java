package cn.lq.c_lq;

import java.util.Arrays;
import java.util.Scanner;

/*��������
����С��Ҫ��֯һ̨��ᣬ�ܹ�׼���� n ����Ŀ��Ȼ������ʱ�����ޣ���ֻ������ѡ�����е� m ����Ŀ��
������ n ����Ŀ�ǰ���С�������˳������ģ�˳���ܸı䡣
����С�����֣����ڶ������ϵ�ϲ���̶���ǰ������Ŀ�ĺÿ��̶��зǳ���Ĺ�ϵ����ϣ��ѡ���ĵ�һ����Ŀ�����ܺÿ����ڴ�ǰ����ϣ���ڶ�����Ŀ�����ܺÿ����������ơ�
����С����ÿ����Ŀ������һ���ÿ�ֵ���������С��ѡ��� m ����Ŀ����������Ҫ��
�����ʽ
��������ĵ�һ�а����������� n, m ����ʾ��Ŀ��������Ҫѡ���������
�����ڶ��а��� n ������������Ϊÿ����Ŀ�ĺÿ�ֵ��
�����ʽ
�������һ�а��� m ��������Ϊѡ���Ľ�Ŀ�ĺÿ�ֵ��
��������
5 3
3 1 2 5 4
�������
3 5 4
����˵��
����ѡ���˵�1, 4, 5����Ŀ��*/
//        forѭ������a[i]
//        i >=n-m  ѡ��m����
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