package cn.lq.a_lq;
/*����һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200*/
/*
�����ʽ
������һ��Ϊһ������n��
�����ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
�����ʽ
�������һ�У�����С�����˳��������������С�
*/
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int temp = 0;
        while (n != 0) {
            n--;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        //ע�������ʽ
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
