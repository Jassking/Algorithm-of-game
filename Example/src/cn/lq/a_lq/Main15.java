package cn.lq.a_lq;

import java.util.Scanner;

/*十六进制数是在程序设计时经常要使用到的一种整数的表示方式。
它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。
十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，
以此类推，十进制的30在十六进制中是1E。
　　给出一个非负整数，将它表示成十六进制的形式。*/
public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String ans = "";
        String afs = "";
        String[] m = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (a == 0) {
            System.out.println(0);
        } else {
            while (a != 0) {
                int q = a % 16;
                if (q >= 0 && q < 10) {//判断是"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
                    ans += m[q];
                } else {//判断是"A", "B", "C", "D", "E", "F"
                    ans += m[q];
                }
                a /= 16;//结束while循环
            }
            //利用 String 的 CharAt 方法取出字符串中的各个字符,再将字符串进行反转
            for (int i = 0; i < ans.length(); i++) {
                char start = ans.charAt(i);
                afs = start + afs;//将字符串进行反转
            }
            System.out.println(afs);
        }
    }
}
