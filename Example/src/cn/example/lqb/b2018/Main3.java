package cn.example.lqb.b2018;

import java.io.FileNotFoundException;
import java.util.Random;

/*�����⣺��������

���´�����Դ�����a[]���ҳ���kС��Ԫ�ء�

��ʹ�������ƿ��������еķ����㷨������ʱ�临�Ӷ���O(N)�ġ�

����ϸ�Ķ�����Դ�룬��д���߲���ȱʧ�����ݡ�*/
public class Main3 {
        public static int quickSelect(int a[], int l, int r, int k) {
            Random rand = new Random();
            int p = rand.nextInt(r - l + 1) + l;
            int x = a[p];
            int tmp = a[p]; a[p] = a[r]; a[r] = tmp;
            int i = l, j = r;
            while(i < j) {
                while(i < j && a[i] < x) i++;
                if(i < j) {
                    a[j] = a[i];
                    j--;
                }
                while(i < j && a[j] > x) j--;
                if(i < j) {
                    a[i] = a[j];
                    i++;
                }
            }
            a[i] = x;
            p = i;
            if(i - l + 1 == k) return a[i];
            if(i - l + 1 < k) return quickSelect( a,i,r,k); //���
//            if(i - l + 1 < k) return quickSelect( __________a,i,r,k_______________________ ); //���
            else return quickSelect(a, l, i - 1, k);
        }
        public static void main(String args[]) {
            int [] a = {1, 4, 2, 8, 5, 7};
            System.out.println(quickSelect(a, 0, 5, 4));
        }

}