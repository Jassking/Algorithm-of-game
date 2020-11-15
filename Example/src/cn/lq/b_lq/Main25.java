package cn.lq.b_lq;

import java.util.Scanner;

/*小明对数位中含有 2、 0、 1、 9 的数字很感兴趣（不包括前导 0），在 1 到
40 中这样的数包括 1、 2、 9、 10 至 32、 39 和 40，共 28 个，他们的和是 574。
请问，在 1 到 n 中，所有这样的数的和是多少？*/
public class Main25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int ans=0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("2") || String.valueOf(i).contains("0") || String.valueOf(i).contains("1") || String.valueOf(i).contains("9")) {
                ans+=i;
                sum++;
                System.out.println(i);
            }
        }
        System.out.println(sum);
        System.out.println(ans);//总和
    }
}
