package cn.example.c_lk.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/*丑数 II
设计一个算法，找出只含素因子2，3，5 的第 n 小的数。
符合条件的数如：1, 2, 3, 4, 5, 6, 8, 9, 10, 12...
样例
样例 1：
输入：9
输出：10
样例 2：
输入：1
输出：1
挑战
要求时间复杂度为 O(nlogn) 或者 O(n)。
注意事项
我们可以认为 1 也是一个丑数。
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
