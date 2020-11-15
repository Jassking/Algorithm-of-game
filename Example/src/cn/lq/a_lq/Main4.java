package cn.lq.a_lq;

import java.util.Scanner;

/*

Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��

��n�Ƚϴ�ʱ��FnҲ�ǳ�������������֪����Fn����10007�������Ƕ��١�
*/
/* ���ݹ�ģ��Լ��
1 <= n <= 1,000,000��*/
public class Main4 {
    private static long afs(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return afs(n - 1) + afs(n - 2);
    }

    public static void main(String[] args) {
        //1.�ݹ鷨
        /*Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b=afs(a)%10007;
        System.out.println(b);*/

        //2.���Ʒ�  �Լ�ֻ��д�����Ʒ�ȥ���������1,000,000
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sum = new int[n];//������
        if (n == 1 || n == 2) {
            sum[n - 1] = 1;
        } else {
            for (int i = 2; i < n; i++) {
                sum[0] = 1;
                sum[1] = 1;
                sum[i] = (sum[i - 1] + sum[i - 2]) % 10007;
            }
        }
        System.out.println(sum[n - 1]);


    }
}
