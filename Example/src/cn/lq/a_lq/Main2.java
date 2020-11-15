package cn.lq.a_lq;
/*求1+2+3+...+n的值。 */
/* 数据规模与约定      自己只能写出暴力法去算出大数字1,000,000,000
1 <= n <= 1,000,000,000。 */
import java.util.Scanner;

public class Main2 {
    private static long afs(long n) {
        if (n == 0) {
            return 0;
        }
        return afs(n - 1) + n;
    }

    public static void main(String[] args) {
        //方法1：递归法
        /*Scanner scanner=new Scanner(System.in);
        long a=scanner.nextInt();
        afs(a);
        System.out.println(afs(a));*/

        //方法2：暴力法
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long sum = 0;
        for (long i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
