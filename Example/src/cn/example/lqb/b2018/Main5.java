package cn.example.lqb.b2018;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/*�����⣺��������

��ͼp1.pgn��ʾ���������߾���ƽ������������ǡ��һ�Ρ�

��������(X, Y)�����Ƕ�������ԭ��ľ���dis(X, Y)�Ǵ�ԭ�㵽(X, Y)���������߶εĳ��ȡ�

����dis(0, 1)=3, dis(-2, -1)=9

������������(X, Y)�����ܼ����dis(X, Y)��

�������ʽ��
X��Y

����40%�����ݣ�-1000 <= X, Y <= 1000
����70%�����ݣ�-100000 <= X�� Y <= 100000
����100%������, -1000000000 <= X, Y <= 1000000000

�������ʽ��
���dis(X, Y)


������������
0 1

�����������
3


��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU���� < 1000ms

���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
��������ֱ����ǣ�Main��������Ч���봦��*/
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(dis(x, y));
    }

    private static BigInteger dis(int x, int y) {// ʹ��BigInteger-->���������˲���������
        int n = max(x, y);// �ҵ�����Ȧ�ǵڼ�Ȧ
        int k = n - 1;// k��ʾ��Ȧ����
        int lost = g(x, y, n);// ������Ȧ·������
        BigInteger most1 = new BigInteger(Integer.toString(8 + k * 8));
        BigInteger most2 = new BigInteger(Integer.toString(k / 2));
        /**
         * most = most1*most2
         * most = (8+k*8)*k/2 --->��Ȧ������һ��������ͣ�1 8 16 24
         */
        BigInteger l = new BigInteger(Integer.toString(lost));
        return l.add((most1.multiply(most2)));
    }

    private static int g(int x, int y, int n) {
        /**
         * �ֳ����󲿷ּ��㣺
         * 1.��ʾ���㴦
         * 2.��ʾÿ���ߵ����
         */
        if (Math.abs(x) == Math.abs(y)) {
            if (x < 0 && y > 0)
                return 2 * n;
            else if (x > 0 && y > 0)
                return 4 * n;
            else if (x > 0 && y < 0)
                return 6 * n;
            else
                return x == 0 ? 0 : 8 * n;
        } else {
            if (x == -n)
                return n + y;
            else if (x == n)
                return 4 * n + n - y;
            else if (y == n)
                return 2 * n + n + x;
            else
                return 6 * 2 + n - x;
        }
    }

    private static int max(int x, int y) {
        //������ߵ�Ȧ��
        if (Math.abs(x) >= Math.abs(y))
            return Math.abs(x);
        else
            return Math.abs(y);
    }

}
