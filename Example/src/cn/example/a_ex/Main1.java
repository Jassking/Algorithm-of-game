package cn.example.a_ex;

import java.util.Random;
import java.util.Scanner;
/*�Ҹ���һ��1~100������ ,����¡�
ÿ�θ�����µ�����ʾ����˻���С��
*/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int i = random.nextInt(100);//����һ��0��x-1������
        int afs = 1;
        while (afs != 0) {
            if (n > i) {
                System.out.println("�´���");
                n = scanner.nextInt();
            } else if (i == n) {
                afs = 0;
            } else {
                System.out.println("��С��");
                n = scanner.nextInt();
            }
        }
        System.out.println("������");
    }
}
