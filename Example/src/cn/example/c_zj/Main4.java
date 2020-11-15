package cn.example.c_zj;
/*
Z国的货币系统包含面值1元、4元、16元、64元共计4种硬币，以及面值1024元的纸币。
现在小Y使用1024元的纸币购买了一件价值为N(0<N≤1024)N (0 < N \le 1024)N(0<N≤1024)的商品，请问最少他会收到多少硬币？
输入描述:
一行，包含一个数N。
输出描述:
一行，包含一个数，表示最少收到的硬币数。
示例1
输入
200
输出
17
说明
花200，需要找零824块，找12个64元硬币，3个16元硬币，2个4元硬币即可。
备注:
对于100%的数据，N(0<N≤1024)N (0 < N \le 1024)N(0<N≤1024)。*/
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=1024-n;
        int q=(sum-sum%64)/64;
        int w=(sum%64-(sum%64)%16)/16;
        int e=((sum%64)%16-((sum%64)%16)%4)/4;
        int r=((sum%64)%16)%4;
        int ans=q+w+e+r;
        System.out.println(ans);
    }
}
