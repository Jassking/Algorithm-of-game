package cn.lq.b_lq;
/*������ a[1], a[2], ..., a[n] �У�
��������±� i, j, k ���� 0<i<j<k<n+1 �� a[i]<a[j]<a[k]��
��� a[i], a[j], a[k] Ϊһ�������Ԫ�飬a[j]Ϊ������Ԫ������ġ�
��������һ�����У������������ж��ٸ�Ԫ�ؿ����ǵ�����Ԫ������ġ�
�����ʽ
��������ĵ�һ�а���һ������ n��
�����ڶ��а��� n ������ a[1], a[2], ..., a[n]�����ڵ��������ÿո�ָ�����ʾ���������С�
�����ʽ
�������һ�а���һ����������ʾ�𰸡�
��������
5
1 2 5 3 5*/
import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] < a[j] && a[j] < a[k]) {
                        sum++;
                        a[j]=0;
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
