package cn.example.lqb.b2018;

import java.util.Scanner;

/*�ڶ���

    ���⣺�������
    ��ͼp1.png��ʾ���ڶ�άƽ������������1x1��С����
    ������ĳ��С�����һ������ΪԲ�Ļ�һ���뾶Ϊ1000��Բ��
    ���ܼ�������Բ���ж��ٸ�������С������
    ע�⣺��Ҫ�ύ����һ����������Ҫ��д�κζ������ݡ�
*/
public class Main {
    public static void main(String[] args) {
        int R=1000;
        int a=1000,b=0,tb=b,count=0;
        for(a=1000;a>=0;a--) {
            while(a*a+b*b<=R*R)b++;
            b--;
            count+=a*(b-tb);
            tb=b;
        }
        System.out.println(count*4);    //�� 3137548
    }
}
