package cn.lq.b_lq;

import java.util.Scanner;

/*С������λ�к��� 2�� 0�� 1�� 9 �����ֺܸ���Ȥ��������ǰ�� 0������ 1 ��
40 �������������� 1�� 2�� 9�� 10 �� 32�� 39 �� 40���� 28 �������ǵĺ��� 574��
���ʣ��� 1 �� n �У��������������ĺ��Ƕ��٣�*/
public class Main25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int ans=0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("2") || String.valueOf(i).contains("0") || String.valueOf(i).contains("1") || String.valueOf(i).contains("9")) {
                ans+=i;
                sum++;
                System.out.println(i);
            }
        }
        System.out.println(sum);
        System.out.println(ans);//�ܺ�
    }
}
