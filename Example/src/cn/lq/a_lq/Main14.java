package cn.lq.a_lq;

import java.util.Scanner;

/*123321��һ���ǳ����������������߶��ʹ��ұ߶���һ���ġ�
��������һ��������n�� �����������������λ����λʮ�������������λ����֮�͵���n ��*/
public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        if (e==1){
            return;
        }
        for (int i = 10000; i < 100000; i++) {
            int j = i % 10;//��λ
            int k = (i % 100) / 10;//ʮλ
            int n = (i % 1000) / 100;//��λ
            int m = (i / 1000) % 10;//ǧλ
            int w = i / 10000;//��λ
            if (j == w && k == m) {
                if (j + k + n + m + w == e) {
                    System.out.println(i);
                }
            }
        }
        for (int i = 100000; i < 1000000; i++) {
            int j = i % 10;//��λ
            int k = (i % 100) / 10;//ʮλ
            int n = (i % 1000) / 100;//��λ
            int m = (i / 1000) % 10;//ǧλ
            int w = (i / 10000) % 10;//��λ
            int r = i / 100000;//ʮ��λ
            if (j == r && k == w && n == m) {
                if (j + k + n + m + w + r == e) {
                    System.out.println(i);
                }
            }
        }
    }
}
