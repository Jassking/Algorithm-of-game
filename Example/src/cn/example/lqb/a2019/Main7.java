package cn.example.lqb.a2019;

import java.util.Arrays;
import java.util.Scanner;

/*
9.��׺���ʽ��

    ������������
    ����N ���Ӻš�M �������Լ�N + M + 1 ������A1; A2; ; AN+M+1��С
    ����֪������������N ���Ӻš�M �������Լ�N + M +1 �������ճ��ĺϷ���
    ��׺���ʽ�У������������һ����
    �������������Ľ����
    ����ʹ��1 2 3 + -����2 3 + 1 -�� �����׺���ʽ�����4�������ġ�
    �������ʽ��
    ��һ�а�����������N ��M��
    �ڶ��а���N + M + 1 ������A1; A2; ; AN+M+1��
    �������ʽ��
    ���һ������������𰸡�
    ���������롿
    1 1
    1 2 3
    �����������
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
