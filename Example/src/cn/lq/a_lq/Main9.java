package cn.lq.a_lq;
/*
小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是：
1. 各组的核桃数量必须相同
2. 各组内必须能平分核桃（当然是不能打碎的）
3. 尽量提供满足1,2条件的最小数量（节约闹革命嘛）
*/
import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //求最小公倍数；两个数的最小公倍数等于两个数的乘积除以最大公约数
        int fun = a * b / afs(a, b);
        int sum = fun * c / afs(fun, c);
        System.out.println(sum);
    }
    //递归法求最大公约数
    private static int afs(int a, int b) {
        if (a < b) {//判断a与b的大小
            int temp = a;
            a = b;
            b = temp;
        }
        //a % b (必须是大数%小数)
        if (a % b != 0) {
            int k = a % b;
            return afs(b, k);
        }
        return b;
    }
}
