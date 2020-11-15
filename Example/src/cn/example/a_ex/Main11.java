package cn.example.a_ex;
/*a和b都是 32位 整数么？
    是的
我可以使用位运算符么？
    当然可以
样例
样例 1:
输入:  a = 1, b = 2
输出: 3
样例解释: 返回a+b的结果.
样例 2:
输入:  a = -1, b = 1
输出: 0
样例解释: 返回a+b的结果.
挑战
显然你可以直接 return a + b，但是你是否可以挑战一下不这样做？（不使用+++等算数运算符）
*/

public class Main11 {
    public static void main(String[] args) {
      aplusb(1,3);
    }
    public static int aplusb(int a, int b) {
        if(a==0)return b;
        if(b==0)return a;
        int x1 = a^b;
        int x2 = (a&b)<<1;
        return aplusb(x1,x2);
    }
}
