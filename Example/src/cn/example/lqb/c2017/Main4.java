package cn.example.lqb.c2017;

import java.util.Scanner;

/*
���⣺��������

С����������һ����ʷ���ס���Щ��ʷ�����г����˺ܶ����ڡ�С��֪����Щ���ڶ���1960��1��1����2059��12��31�ա���С��ͷ�۵��ǣ���Щ���ڲ��õĸ�ʽ�ǳ���ͳһ���в�����/��/�յģ��в�����/��/��ģ����в�����/��/��ġ������鷳���ǣ����Ҳ��ʡ����ǰ��λ��ʹ�������ϵ�һ�����ڣ����ںܶ���ܵ����������Ӧ��

����02/03/04��������2002��03��04�ա�2004��02��03�ջ�2004��03��02�ա�

����һ�������ϵ����ڣ����ܰ���С���ж�����Щ���ܵ����ڶ����Ӧ��

����
----
һ�����ڣ���ʽ��"AA/BB/CC"��  (0 <= A, B, C <= 9)

����
----
������ɸ�����ͬ�����ڣ�ÿ������һ�У���ʽ��"yyyy-MM-dd"��������ڰ����絽�����С�

��������
----
02/03/04

�������
----
2002-03-04
2004-02-03
2004-03-02

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 1000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
��������ֱ����ǣ�Main��������Ч���봦��
������������������������ȷ������£����ж�a�Ƿ����60����������һ����19**�꣬
��С�����ж�a�Ƿ���12��60֮�䣬���ڣ���aһ��Ϊ��ݲ����·ݣ��ٸ���b�ж�b�Ƿ�Ϊ�·ݡ�*/
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = s.substring(0, 2);
        String b = s.substring(3, 5);
        String c = s.substring(6, 8);
        if (Integer.parseInt(a) >= 60) {
            System.out.println(1900 + Integer.parseInt(a) + "-" + b + "-" + c);
        }
        if (Integer.parseInt(a) > 12 && Integer.parseInt(a) < 60) {
            if (Integer.parseInt(b) < 12) {
                if (Integer.parseInt(b) == 1 || Integer.parseInt(b) == 3
                        || Integer.parseInt(b) == 5 || Integer.parseInt(b) == 7
                        || Integer.parseInt(b) == 8
                        || Integer.parseInt(b) == 10
                        || Integer.parseInt(b) == 12
                        && Integer.parseInt(a) <= 31)
                    System.out.println(2000 + Integer.parseInt(c) + "-" + b
                            + "-" + a);
                if (Integer.parseInt(b) == 4 || Integer.parseInt(b) == 6
                        || Integer.parseInt(b) == 9
                        || Integer.parseInt(b) == 11
                        && Integer.parseInt(a) < 31)
                    System.out.println(2000 + Integer.parseInt(c) + "-" + b
                            + "-" + a);
                if (Integer.parseInt(b) == 2
                        && (run(Integer.parseInt(b) + 2000) && Integer
                        .parseInt(a) <= 29) || Integer.parseInt(a) < 28) {
                    System.out.println(2000 + Integer.parseInt(c) + "-" + b
                            + "-" + a);
                }
            } else
                System.out.println(2000 + Integer.parseInt(a) + "-" + b + "-"
                        + c);
        }
        if (Integer.parseInt(a) < 13) {
            if (Integer.parseInt(b) < 13) {
                System.out.println(2000 + Integer.parseInt(a) + "-" + b + "-"
                        + c);
                System.out.println(2000 + Integer.parseInt(c) + "-" + a + "-"
                        + b);
                System.out.println(2000 + Integer.parseInt(c) + "-" + b + "-"
                        + a);
            } else {
                System.out.println(2000 + Integer.parseInt(c) + "-" + a + "-"
                        + b);
            }

        }
    }

    private static boolean run(int i) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            return true;
        } else
            return false;
    }

}
