package cn.example.b_wy;
/*
С�׸��������ֺ�ϵ����ÿ�β�������Խ���ɻ��߽���ɡ������ټ��β���ʹ�á�
��������:
��һ����������������ÿ�����ݣ�һ���ĸ�������
�������:
����ÿ�����ݣ����һ�����ֱ�ʾ��
��������1:
2
1 5 7 2
3 5 1 2
�������1:
1
2
��������2:
2
1 15 4 2
12 19 3 2
�������2:
3
3
* */
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Long[] a = new Long[t];
        int[] b = new int[t];
        Long[] p = new Long[t];
        int[] q = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = scanner.nextLong();
            b[i] = scanner.nextInt();
            p[i] = scanner.nextLong();
            q[i] = scanner.nextInt();
        }
        for (int i = 0; i < t; i++) {
            ans(a[i], b[i], p[i], q[i]);
        }
    }
    private static void ans(Long a, int b, Long p, int q) {
        boolean afs=true;
        int sum = 0;
        long da;
        while (afs){
            da = a + p;
            ++sum;
            if (da>= b) {
                System.out.println(sum);
                afs=false;
            } else {
                p =p * q;
                da=a;
            }
        }
    }
}
