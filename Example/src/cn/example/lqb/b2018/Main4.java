package cn.example.lqb.b2018;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*�����⣺������Ԫ��

����������������
A = [A1, A2, ... AN],
B = [B1, B2, ... BN],
C = [C1, C2, ... CN]��
����ͳ���ж��ٸ���Ԫ��(i, j, k) ���㣺

1. 1 <= i, j, k <= N
2. Ai < Bj < Ck

�������ʽ��
��һ�а���һ������N��
�ڶ��а���N������A1, A2, ... AN��
�����а���N������B1, B2, ... BN��
�����а���N������C1, C2, ... CN��

����30%�����ݣ�1 <= N <= 100
����60%�����ݣ�1 <= N <= 1000
����100%�����ݣ�1 <= N <= 100000 0 <= Ai, Bi, Ci <= 100000

�������ʽ��
һ��������ʾ��

������������
3
1 1 1
2 2 2
3 3 3

�����������
27


��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU���� < 1000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�
���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
��������ֱ����ǣ�Main��������Ч���봦��*/
public class Main4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        for(int i=0;i<n;i++)
            A[i] = 1;
        for(int i=0;i<n;i++)
            B[i] = 2;
        for(int i=0;i<n;i++)
            C[i] = 3;

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        int[] v = new int[n];//������B�����A[i]���Ԫ�ظ���
        int[] w = new int[n];//ͬ��
//		int[] p = new int[n];//����ָ������,i->j->k,����ʵn-v[i]�Ϳ����ҵ�B�����Ǹ��պñ�A[i]����±�

        long ans=0;
        for(int i=0;i<n;i++) {
            int l=0,r=n-1;
            while(l<=r){
                int mid = l + (r-l)/2;
                if(B[mid]>A[i])
                    r= mid-1;
                else
                    l = mid +1;
            }
            v[i] = n-l;
//			p[i] = l;
        }

        for(int i=0;i<n;i++) {
            int l=0,r=n-1;
            while(l<=r){
                int mid = l + (r-l)/2;
                if(C[mid]>B[i])
                    r= mid-1;
                else
                    l = mid +1;//11+11+3+1
            }
            w[i] = n-l;
        }
        for(int i=0;i<n;i++) {
            System.out.println(v[i]+" "+w[n-v[i]]);
            ans+=v[i]*w[n-v[i]];
        }
        System.out.println(ans);
    }
}
