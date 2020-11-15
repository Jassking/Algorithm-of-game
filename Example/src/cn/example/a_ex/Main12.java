package cn.example.a_ex;
/*2. 尾部的零
设计一个算法，计算出n阶乘中尾部零的个数
样例
样例  1:
	输入: 11
	输出: 2
	样例解释:
	11! = 39916800, 结尾的0有2个。
样例 2:
	输入:  5
	输出: 1
	样例解释:
	5! = 120， 结尾的0有1个。
挑战
O(logN)的时间复杂度*/
public class Main12 {
    public static void main(String[] args) {
        System.out.println(trailingZeros(50));
    }
    public static long trailingZeros(long n) {
       long sum=0;
       long temp=n/5;//判断有几个5，尾部就有几个0
       while (temp!=0){
           sum+=temp;
           temp/=5;
       }
       return sum;
    }
}
