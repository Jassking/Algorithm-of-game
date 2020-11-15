package cn.example.c_lk.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/*���� II
���һ���㷨���ҳ�ֻ��������2��3��5 �ĵ� n С������
�������������磺1, 2, 3, 4, 5, 6, 8, 9, 10, 12...
����
���� 1��
���룺9
�����10
���� 2��
���룺1
�����1
��ս
Ҫ��ʱ�临�Ӷ�Ϊ O(nlogn) ���� O(n)��
ע������
���ǿ�����Ϊ 1 Ҳ��һ��������
*/
public class Main2 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1665));
    }
    /* public int nthUglyNumber(int n) {
       int sum = 0;
        int con = 0;
        while (sum <n) {
            con++;
            int temp = con;
            while (temp % 2 == 0) {
                temp /= 2;
            }
            while (temp % 3 == 0) {
                temp /= 3;
            }
            while (temp % 5 == 0) {
                temp /= 5;
            }
            if (temp == 1) {
                sum++;
            }
        }
        return  con;
    }*/

    public static int nthUglyNumber(int n) {
        int sum = 1;
        int con = 1;
        Set<Integer> set=new HashSet<>();
        set.add(1);
        while (sum < n) {
            con++;
            int temp = con;
            if(temp % 2 == 0) {
                temp /= 2;
                if (set.contains(temp)){
                    temp=1;
                }
            }
            if (temp % 3 == 0) {
                temp /= 3;
                if (set.contains(temp)){
                    temp=1;
                }
            }
            if (temp % 5 == 0) {
                temp /= 5;
                if (set.contains(temp)){
                    temp=1;
                }
            }
            if (temp == 1) {
                set.add(con);
                sum++;
            }
            System.out.println(set.toString());
        }
        return con;
    }
}
