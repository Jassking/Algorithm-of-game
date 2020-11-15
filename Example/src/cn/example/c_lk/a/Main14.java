package cn.example.c_lk.a;
/*1669. 建庙
你是一名建造寺庙的建筑师。
寺庙的柱子是由木头制成。每根柱子必须是一jie完整的木头而且不能是被连接得到的。
给出n段具有不同长度的木头。你的寺庙有m根高度严格相同的柱子。那么你寺庙最大高度是多少。(m根柱子的高度)
样例
样例 1:
输入：m = 3, [2, 3, 4]
输出：2
解释：选择长度为2的木头并且长度为4的木头被分为两段长度为2的木头。
样例 2:
输入：m = 3, [2, 10]
输出：3
解释：长度为10的木头分为3段长度为3的木头和一根长度为1的木头。
注意事项
    1<=n<=100000
    1<=m<=100000
*/
public class Main14 {
    public static void main(String[] args) {
        int[] n={232, 124, 456};
        System.out.println(woodCut(n, 7));
    }

    public static int woodCut(int[] L, int k) {
        int i = 0; int j = 0; int sum = 0; int max = 0; int  max0 = 0; int t = 0;
        if (L == null || L.length == 0) {
            return 0;
        }
        int []J = new int [L.length];
        for (i = 0; i < L.length; i++) {
            J[i] = L[i];
            sum += L[i] / k;
        }
        for (i = 0; i < L.length - 1; i++) {
            if (L[0] < L[i]) {
                t = L[0];
                L[0] = L[i];
                L[i] = t;
            }
        }
        max0 = Math.max(sum, L[0]);
        for (max = max0; max >= 1; max--) {
            sum = 0;
            for (i = 0; i < L.length; i++) {
                sum += J[i] / max;
            }
            if (sum >= k) {
                break;
            }
        }
        return max;
    }
}
