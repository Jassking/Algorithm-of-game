package cn.lq.a_lq;
/*��1+2+3+...+n��ֵ�� */
/* ���ݹ�ģ��Լ��      �Լ�ֻ��д��������ȥ���������1,000,000,000
1 <= n <= 1,000,000,000�� */
import java.util.Scanner;

public class Main2 {
    private static long afs(long n) {
        if (n == 0) {
            return 0;
        }
        return afs(n - 1) + n;
    }

    public static void main(String[] args) {
        //����1���ݹ鷨
        /*Scanner scanner=new Scanner(System.in);
        long a=scanner.nextInt();
        afs(a);
        System.out.println(afs(a));*/

        //����2��������
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long sum = 0;
        for (long i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
