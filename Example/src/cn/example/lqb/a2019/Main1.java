package cn.example.lqb.a2019;

import java.util.HashSet;
import java.util.Set;

/*
3.������ֵ��

    ��������1, 1, 1, 3, 5, 9, 17, �����ӵ�4 �ʼ��ÿ���ǰ3 ��ĺ͡���
    ��20190324 ������4 λ���֡�
*/
public class Main1 {
    public static void main(String[] args) {
        int n = 20190324;
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i = 4; i <= n; i++) {
            if(i % 3 == 1) {
                a = (a + b + c) % 10000;
            }else if(i % 3 == 2) {
                b = (a + b + c) % 10000;
            }else {
                c = (a + b + c) % 10000;
            }
        }
        if(n % 3 == 1) {
            System.out.println(a);
        }else if( n % 3 == 2) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
        /*int a = 1, b = 1, c = 1;
		// Ҫ����������i < 4, ͬ���Ƶ���20190324����i < 20190324��
		for (int i = 3; i < 20190324; i++) {
			int temp = (a + b + c) % 10000;
			a = b;
			b = c;
			c = temp;
		}
		System.out.println(c);*/
    }
}
