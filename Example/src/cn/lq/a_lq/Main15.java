package cn.lq.a_lq;

import java.util.Scanner;

/*ʮ�����������ڳ������ʱ����Ҫʹ�õ���һ�������ı�ʾ��ʽ��
����0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F��16�����ţ��ֱ��ʾʮ��������0��15��
ʮ�����Ƶļ�����������16��1������ʮ������16��ʮ����������10����ʮ���Ƶ�17��ʮ����������11��
�Դ����ƣ�ʮ���Ƶ�30��ʮ����������1E��
��������һ���Ǹ�������������ʾ��ʮ�����Ƶ���ʽ��*/
public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String ans = "";
        String afs = "";
        String[] m = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (a == 0) {
            System.out.println(0);
        } else {
            while (a != 0) {
                int q = a % 16;
                if (q >= 0 && q < 10) {//�ж���"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
                    ans += m[q];
                } else {//�ж���"A", "B", "C", "D", "E", "F"
                    ans += m[q];
                }
                a /= 16;//����whileѭ��
            }
            //���� String �� CharAt ����ȡ���ַ����еĸ����ַ�,�ٽ��ַ������з�ת
            for (int i = 0; i < ans.length(); i++) {
                char start = ans.charAt(i);
                afs = start + afs;//���ַ������з�ת
            }
            System.out.println(afs);
        }
    }
}
