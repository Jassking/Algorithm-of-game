package cn.example.lqb.a2019;

import java.util.Scanner;

/*
6.�ر����ĺͣ�

    С������λ�к���2��0��1��9 �����ֺܸ���Ȥ��������ǰ��0������1 ��
    40 ��������������1��2��9��10 ��32��39 ��40����28 �������ǵĺ���574��
    ���ʣ���1 ��n �У��������������ĺ��Ƕ��٣�

    ���룺

    ����һ�а���һ������n��

    �����

    ���һ�У�����һ����������ʾ�������������ĺ͡�

    ���������롿
    40
    �����������
    574
*/
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(check(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean check(int i) {
        char[] s = String.valueOf(i).toCharArray();
        for(int b = 0; b < s.length; b++) {
            if(s[b] == '2' || s[b] == '0' || s[b] == '1' || s[b] == '9') {
                return true;
            }
        }
        return false;
    }
}
