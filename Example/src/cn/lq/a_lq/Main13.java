package cn.lq.a_lq;
/*1221��һ���ǳ����������������߶��ʹ��ұ߶���һ���ģ������������������λʮ��������*/
public class Main13 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int j = i % 10;//��λ
            int k = (i % 100) / 10;//ʮλ
            int n = (i % 1000) / 100;//��λ
            int m = i / 1000;//ǧλ
            if (j == m && k == n) {
                System.out.println(i);
            }
        }
    }
}

