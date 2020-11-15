package cn.example.lqb.a2019;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
7.外卖店优先级：

    “饱了么”外卖系统中维护着N 家外卖店，编号1 N。每家外卖店都有
    一个优先级，初始时(0 时刻) 优先级都为0。
    每经过1 个时间单位，如果外卖店没有订单，则优先级会减少1，最低减
    到0；而如果外卖店有订单，则优先级不减反加，每有一单优先级加2。
    如果某家外卖店某时刻优先级大于5，则会被系统加入优先缓存中；如果
    优先级小于等于3，则会被清除出优先缓存。
    给定T 时刻以内的M 条订单信息，请你计算T 时刻时有多少外卖店在优
    先缓存中。

    【输入格式】
    第一行包含3 个整数N、M 和T。
    以下M 行每行包含两个整数ts 和id，表示ts 时刻编号id 的外卖店收到
    一个订单。
    【输出格式】
    输出一个整数代表答案。
    【样例输入】
    2 6 6
    1 1
    5 2
    3 1
    6 2
    2 1
    6 2

    【样例输出】
    1

    【样例解释】
    6 时刻时，1 号店优先级降到3，被移除出优先缓存；2 号店优先级升到6，
    加入优先缓存。所以是有1 家店(2 号) 在优先缓存中。
*/
public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Set<Integer> set = new HashSet<Integer>();
            int N = input.nextInt();
            int M = input.nextInt();
            int T = input.nextInt();
            int[][] orders = new int[M][2];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < 2; j++) {
                    orders[i][j] = input.nextInt();
                }
            }
            int[] priority = new int[N];
            int[] sign = new int[N];
            for (int i = 1; i <= T; i++) {
                for (int j = 0; j < M; j++) {
                    if (orders[j][0] == i) {
                        priority[orders[j][1] - 1] += 2;
                        if (priority[orders[j][1] - 1] > 5 && !set.contains(orders[j][1] - 1)) {
                            set.add(orders[j][1] - 1);
                        }
                        sign[orders[j][1] - 1] = 1;
                    }
                }
                for (int j = 0; j < N; j++) {
                    if (sign[j] == 0 && priority[j] > 0)
                        priority[j]--;
                    if (priority[j] <= 3) {
                        set.remove(j);
                    }
                }
                sign = new int[N];
            }
            System.out.println(set.size());
        } catch (Exception e) {
            input.close();
        }
    }
}
