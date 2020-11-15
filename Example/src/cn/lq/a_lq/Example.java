package cn.lq.a_lq;

import java.util.Scanner;
//计算大整数乘法
public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String m = in.next();
        String result = multiply(n, m);
        System.out.println(result);
    }
    // 计算两个整数相乘
    private static String multiply(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder(); //用来存储结果
        StringBuilder stringBuilder1 = new StringBuilder(a);
        StringBuilder stringBuilder2 = new StringBuilder(b);
        //反转两个大整数,以便从个位开始相乘
        stringBuilder1.reverse();
        stringBuilder2.reverse();
        int[] arrays = new int[stringBuilder1.length() + stringBuilder2.length()];//用来放中间计算结果
        for(int i = 0; i < stringBuilder1.length(); i++){
            for(int j =0; j < stringBuilder2.length();j++){
                //错位相加,保存结果中每一位的累加和
                int k = (stringBuilder1.charAt(i) - '0') * (stringBuilder2.charAt(j) - '0');
                arrays[i+j]=arrays[i+j]+ k;
            }
        }
        for(int i = 0; i < arrays.length - 1; i++){
            int n=arrays[i] / 10;//每一位大于十的进位,保留余数
            arrays[i+1] =arrays[i+1]+ n;
            arrays[i] %= 10;
        }
        for(int i = 0; i < arrays.length - 1; i++){//把结果循环最加到答案
            stringBuilder.append(arrays[i]);
        }
        return stringBuilder.reverse().toString();
    }
}


