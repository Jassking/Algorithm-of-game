package cn.example.b_wy;

import java.util.Scanner;
/*
ʱ�����ƣ�C/C++ 1�룬��������2��
�ռ����ƣ�C/C++ 256M����������512M
���ַ�������ʽ�����������֣������ַ�������ʽ����������ֵĺ͡�
��������:
�������У���ʾ��������a��b��-109 <= a , b <= 109  ����˫��������
�������:
���a+b��ֵ����˫��������
��������1:
"-26"
"100"

"-260000"
"1000000"
"-1000000"
"1000001"
�������1:
"74"
*/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String s1=scanner.next();
        String substring = s.substring(1, s.length() - 1);
        String substring1 = s1.substring(1, s1.length() - 1);
        String substring2 = s.substring(0,1);
        String substring3 = s.substring(s.length()-1);
        int i = Integer.parseInt(substring);
        int i1 = Integer.parseInt(substring1);
        System.out.println(substring2+(i+i1)+substring3);
    }
}
