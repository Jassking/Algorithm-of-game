package cn.lq.b_lq;

import java.util.ArrayList;
import java.util.Scanner;

/*һ���������У������е�ÿһ��ֵ���ܹ���2����3����5��������
������еĳ�ʼֵ��1��ʼ������1��������������С����1500��ֵ�Ƕ��٣�*/
public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = 0;
        for (int i = 2; i < 100000; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                arrayList.add(i);
                n++;
            }
            if (n == 1500)
                System.out.println(arrayList.toString());
        }
    }
}





