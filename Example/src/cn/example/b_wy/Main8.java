package cn.example.b_wy;
/*小易给定你一个长度为的正整数序列，你每次可以使用的代价将某个数加一或者减一，
你希望用最少的代价使得所有数的乘积等于，求最小代价（操作结束后每个数也必须是正整数）。
输入描述:
第一行数字,表示序列长度和目标乘积。
接下来一行个正整数表示初始序列。
输出描述:
一行一个数字表示答案
输入例子1:
5 12
1 3 9 2 6
输出例子1:
10
例子说明1:
把3变为1需要2的代价，把9变为1需要8的代价，总代价为10。
输入例子2:
3 15
3 8 7
输出例子2:
9
例子说明2:
把8变为5需要3的代价，把7变为1需要6的代价，总代价为9。
*/
/*
用例:
100 505
977 205 100 401 363 135 496 355 897 85 127 109 635 97 491 101 526 342 451 49 896 809 281 399 379 928 667 559 416 65 401 47 625 105 93 389 771 195 616 161 31 561 616 303 736 961 665 805 423 989 137 972 868 126 736 913 768 57 288 614 927 475 741 49 810 1 911 425 849 387 990 915 441 831 315 61 697 16 479 577 596 708 189 709 29 961 967 986 761 409 170 615 457 506 541 131 250 805 727 287

对应输出应该为:

48410

你的输出为:

48810*/

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();//一行个正整数表示初始序列
        int sum = 0;
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        while (m != 1) {
            for (int i = list.size() - 1; i >= 0; i--) {
                if (m % list.get(i) == 0) {
                    m = m / list.get(i);
                    list.remove(i);
                }
            }
            if (m != 1) {
                for (int i = list.size()-1; i >0 ; i--) {
                    int integer = list.get(i);
                    while (m % integer != 0) {
                        integer--;
                        sum++;
                    }
                    m = m / integer;
                    list.remove(list.size()-1);
                }
            }
        }
        if (list.size()!=0) {
            for (Integer integer : list) {
                sum += integer - 1;
            }
        }
        System.out.println(sum);
    }
}

