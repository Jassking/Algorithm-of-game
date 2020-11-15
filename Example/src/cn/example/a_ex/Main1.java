package cn.example.a_ex;

import java.util.Random;
import java.util.Scanner;
/*我给你一个1~100的数字 ,让你猜。
每次根据你猜的数提示你大了还是小了
*/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int i = random.nextInt(100);//产生一个0到x-1的正数
        int afs = 1;
        while (afs != 0) {
            if (n > i) {
                System.out.println("猜大了");
                n = scanner.nextInt();
            } else if (i == n) {
                afs = 0;
            } else {
                System.out.println("猜小了");
                n = scanner.nextInt();
            }
        }
        System.out.println("猜中了");
    }
}
