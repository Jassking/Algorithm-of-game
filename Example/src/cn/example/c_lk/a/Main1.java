package cn.example.c_lk.a;
/*统计数字
计算数字 k 在 0 到 n 中的出现的次数，k 可能是 0~9 的一个值。
样例
样例 1：
输入：
k = 1, n = 1
输出：
1
解释：
在 [0, 1] 中，我们发现 1 出现了 1 次 (1)。
样例 2：
输入：
k = 1, n = 12
输出：
5
解释：
在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] 中，我们发现 1 出现了 5 次 (1, 10, 11, 12)(注意11中有两个1)。
*/
public class Main1 {
    public static void main(String[] args) {
        System.out.println(digitCounts(0,0));
    }
    public static int digitCounts(int k, int n) {
        int sum=0;
        for (int i = 0; i <= n; i++) {
            String s=i+"";
            for (int j = 0; j < s.length(); j++) {
                if(Integer.parseInt(String.valueOf(s.charAt(j)))==k){
                    sum++;
                }
            }
        }
        return sum;
    }
}
