package cn.lq.a_lq;
/*
����������ֳ�Pascal�����Σ����ĵ�i+1����(a+b)i��չ��ʽ��ϵ����
����һ����Ҫ�����ǣ��������е�ÿ�����ֵ����������ϵ�������ӡ���
�����������������ε�ǰ4�У���
   1��
  1 1��
 1 2 1
1 3 3 1
����n���������ǰn�С�
*/
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];//���м���
        for (int i = 0; i < n; i++) {
            //�г����ߵ�1
            a[i][0] = 1;
            a[i][i] = 1;
            //�������е�ÿ�����ֵ����������ϵ�������ӡ�
            for (int j = 0; j < i; j++) {
                a[i][j+1]=a[i-1][j]+a[i-1][j+1];
            }
        }
        for (int i = 0; i < n; i++) {//0,1,2,3��
            for (int j = 0; j <=i; j++) {//��Ϊa������n��n�еģ�j�������i(0,1,2,3)
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
