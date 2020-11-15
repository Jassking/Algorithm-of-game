package cn.example.b_wy;

import java.util.Scanner;

/*
给定一个字符串，你的任务是计算这个字符串中有多少个回文子串（回文串是一个正读和反读都一样的字符串）。
具有不同开始位置或结束位置的回文串，即使是由相同的字符组成，也会被计为是不同的子串。
输入描述:
输入仅包含一个字符串，长度不会超过 1000。
输出描述:
输出仅包含一个非负整数， 代表输入字符串有多少个回文子串。
输入例子1:
abc
输出例子1:
3
输入例子2:
aaa
输出例子2:
6
*/
public class  Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String substring;
        String s = scanner.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1 ; j <= s.length(); j++) {
                substring = s.substring(i, j);
                if (afs(substring)) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
//    方法3：
//    private static boolean afs(String substring) {
//        StringBuilder stringBuffer=new StringBuilder(substring);
//        char[] chars = substring.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] != chars[chars.length - 1 - i]){
//                return false;
//            }
//        }
//        return true;
//    }
    private static boolean afs(String substring) {
        StringBuilder stringBuffer=new StringBuilder(substring);
        String string= stringBuffer.reverse().toString();
        char[] chars = substring.toCharArray();
        char[] chars1 = string.toCharArray();
        //方法1：return stringBuffer.toString().equals(stringBuffer.reverse().toString());
        //方法2：
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j <= i; j++) {
                if (chars[i]!=chars1[j]){
                    return false;
                }
            }
        }
        return true;
    }
}

