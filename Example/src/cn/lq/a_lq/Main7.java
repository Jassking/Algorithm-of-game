package cn.lq.a_lq;

import java.util.Scanner;

/*
������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�
*/
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//����
        int m=scanner.nextInt();//����
        int[] a=new int[26];
        //��A-Z����a[]��
        char s='A';
        for (int i = 0; i < 26; i++) {
            a[i]=s+i;
        }
        //ѭ��
        for (int i = 0; i < n; i++) {//�жϵڼ���
            for (int j = 0; j < m; j++) {//�жϵڼ���
                if (i==j){//��i==jʱ��a[i]=A
                    System.out.print((char)a[0]);
                }else if (j-i>0){//��j-i>0ʱ����ʾA���ұ�
                    System.out.print((char)a[j-i]);
                }else {//������A�����
                    System.out.print((char)a[Math.abs(j-i)]);//Math.abs()��ʾ����ֵ
                }
            }
            System.out.println();
        }

    }
}
