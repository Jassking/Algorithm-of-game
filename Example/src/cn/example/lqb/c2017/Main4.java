package cn.example.lqb.c2017;

import java.util.Scanner;

/*
标题：日期问题

小明正在整理一批历史文献。这些历史文献中出现了很多日期。小明知道这些日期都在1960年1月1日至2059年12月31日。令小明头疼的是，这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应。

比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。

给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？

输入
----
一个日期，格式是"AA/BB/CC"。  (0 <= A, B, C <= 9)

输入
----
输出若干个不相同的日期，每个日期一行，格式是"yyyy-MM-dd"。多个日期按从早到晚排列。

样例输入
----
02/03/04

样例输出
----
2002-03-04
2004-02-03
2004-03-02

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
不要使用package语句。不要使用jdk1.7及以上版本的特性。
主类的名字必须是：Main，否则按无效代码处理。
【解析】：在输入的年份是正确的情况下，先判断a是否大于60，若大于则一定是19**年，
若小于再判断a是否在12和60之间，若在，则a一定为年份不是月份，再根据b判断b是否为月份。*/
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = s.substring(0, 2);
        String b = s.substring(3, 5);
        String c = s.substring(6, 8);
        if (Integer.parseInt(a) >= 60) {
            System.out.println(1900 + Integer.parseInt(a) + "-" + b + "-" + c);
        }
        if (Integer.parseInt(a) > 12 && Integer.parseInt(a) < 60) {
            if (Integer.parseInt(b) < 12) {
                if (Integer.parseInt(b) == 1 || Integer.parseInt(b) == 3
                        || Integer.parseInt(b) == 5 || Integer.parseInt(b) == 7
                        || Integer.parseInt(b) == 8
                        || Integer.parseInt(b) == 10
                        || Integer.parseInt(b) == 12
                        && Integer.parseInt(a) <= 31)
                    System.out.println(2000 + Integer.parseInt(c) + "-" + b
                            + "-" + a);
                if (Integer.parseInt(b) == 4 || Integer.parseInt(b) == 6
                        || Integer.parseInt(b) == 9
                        || Integer.parseInt(b) == 11
                        && Integer.parseInt(a) < 31)
                    System.out.println(2000 + Integer.parseInt(c) + "-" + b
                            + "-" + a);
                if (Integer.parseInt(b) == 2
                        && (run(Integer.parseInt(b) + 2000) && Integer
                        .parseInt(a) <= 29) || Integer.parseInt(a) < 28) {
                    System.out.println(2000 + Integer.parseInt(c) + "-" + b
                            + "-" + a);
                }
            } else
                System.out.println(2000 + Integer.parseInt(a) + "-" + b + "-"
                        + c);
        }
        if (Integer.parseInt(a) < 13) {
            if (Integer.parseInt(b) < 13) {
                System.out.println(2000 + Integer.parseInt(a) + "-" + b + "-"
                        + c);
                System.out.println(2000 + Integer.parseInt(c) + "-" + a + "-"
                        + b);
                System.out.println(2000 + Integer.parseInt(c) + "-" + b + "-"
                        + a);
            } else {
                System.out.println(2000 + Integer.parseInt(c) + "-" + a + "-"
                        + b);
            }

        }
    }

    private static boolean run(int i) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            return true;
        } else
            return false;
    }

}
