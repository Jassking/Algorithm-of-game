package cn.lq.b_lq;

import java.util.Scanner;

/*1200000�ж��ٸ�Լ����ֻ������Լ������*/
/*���ύ
��������һ�������յ��⣬��ֻ��Ҫ���������ύ���ɡ�����Ľ��Ϊһ�����������ύ��ʱֻ��д�����������д��������ݽ��޷��÷֡�*/
public class Main26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for (int i = 1; i <= 1200000; i++) {
            if (n%i==0){
                System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
