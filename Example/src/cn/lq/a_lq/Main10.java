package cn.lq.a_lq;
/*
����һ������n�����������У�������a�������еĵ�һ�γ����ǵڼ�����
 ���ݹ�ģ��Լ��
1 <= n <= 1000��
*/
/* �����ʽ
��һ�а���һ������n��
�ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��
�����а���һ������a��Ϊ�����ҵ�����
�����ʽ
���a�������г����ˣ��������һ�γ��ֵ�λ��(λ�ô�1��ʼ���)���������-1�� */
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            index++;
            if (a[i] == m) {
                System.out.println(index);
                return;
            }
        }
        int q = -1;
        System.out.println(q);
    }
}
