package cn.example.lqb.a2019;

import java.util.Arrays;
import java.util.Scanner;

/*
9.后缀表达式：

    【问题描述】
    给定N 个加号、M 个减号以及N + M + 1 个整数A1; A2; ; AN+M+1，小
    明想知道在所有由这N 个加号、M 个减号以及N + M +1 个整数凑出的合法的
    后缀表达式中，结果最大的是哪一个？
    请你输出这个最大的结果。
    例如使用1 2 3 + -，则“2 3 + 1 -” 这个后缀表达式结果是4，是最大的。
    【输入格式】
    第一行包含两个整数N 和M。
    第二行包含N + M + 1 个整数A1; A2; ; AN+M+1。
    【输出格式】
    输出一个整数，代表答案。
    【样例输入】
    1 1
    1 2 3
    【样例输出】
    4
*/
public class Main7 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n +m + 1];
        for(int i = 0; i < n + m + 1; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        for(int i = n + m; i >= 0; i--) {
            if(i > n - 1) {
                sum += a[i];
            }else {
                sum -= a[i];
            }
        }
        System.out.println(sum);
    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        try {
//            int add = input.nextInt();
//            int reduce = input.nextInt();
//            int totalLength = add + reduce + 1;
//            int[] number = new int[totalLength];
//            for (int i = 0; i < totalLength; i++) {
//                number[i] = input.nextInt();
//            }
//            int sum = 0;
//            if (reduce == 0) {
//                for (int i = 0; i < totalLength; i++) {
//                    sum += number[i];
//                }
//            }
//            if (add == 0) {
//                Arrays.sort(number);
//                if (number[0] < 0) {
//                    for (int i = 0; i <= reduce; i++) {
//                        if (number[i] > 0)
//                            sum += number[i];
//                        else
//                            sum -= number[i];
//                    }
//                } else {
//                    for (int i = 1; i <= reduce; i++) {
//                        sum += number[i];
//                    }
//                    sum -= number[0];
//                }
//            }
//            if (add != 0 && reduce != 0) {
//                int reduceNum = 0;
//                for (int i = 0; i < totalLength; i++) {
//                    if (number[i] < 0) {
//                        reduceNum++;
//                    }
//                }
//                if (reduce >= reduceNum) {
//                    Arrays.sort(number);
//                    int temp = reduce;
//                    for (int i = 0; i < reduceNum; i++) {
//                        number[i] = -number[i];
//                        temp--;
//                    }
//                    Arrays.sort(number);
//                    for (int i = totalLength - 1; i >= temp; i--) {
//                        sum += number[i];
//                    }
//                    for (int i = temp - 1; i >= 0; i--) {
//                        sum -= number[i];
//                    }
//                } else {
//                    Arrays.sort(number);
//                    sum += number[totalLength - 1];
//                    for (int i = 0; i < totalLength - 1; i++) {
//                        if (number[i] > 0)
//                            sum += number[i];
//                        else
//                            sum -= number[i];
//                    }
//                }
//            }
//            System.out.println(sum);
//        } catch (Exception e) {
//            input.close();
//        }
//    }
}
