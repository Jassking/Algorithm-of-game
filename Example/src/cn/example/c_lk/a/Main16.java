package cn.example.c_lk.a;
/*查找斐波纳契数列中第 N 个数。
所谓的斐波纳契数列是指：
    前2个数是 0 和 1 。
    第 i 个数是第 i-1 个数和第i-2 个数的和。
斐波纳契数列的前10个数字是：
0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
样例  1:
	输入:  1
	输出: 0
	样例解释:
	返回斐波那契的第一个数字，是0.
样例 2:
	输入:  2
	输出: 1
	样例解释:
	返回斐波那契的第二个数字是1.
*/
public class Main16 {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    public static int fibonacci(int n) {
        if (n==1){
            return 0;
        }
        if (n==3||n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
