package cn.example.b_wy;

import java.util.Scanner;
/*
时间限制：C/C++ 1秒，其他语言2秒
空间限制：C/C++ 256M，其他语言512M
以字符串的形式读入两个数字，再以字符串的形式输出两个数字的和。
输入描述:
输入两行，表示两个数字a和b，-109 <= a , b <= 109  ，用双引号括起。
输出描述:
输出a+b的值，用双引号括起。
输入例子1:
"-26"
"100"

"-260000"
"1000000"
"-1000000"
"1000001"
输出例子1:
"74"
*/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String s1=scanner.next();
        String substring = s.substring(1, s.length() - 1);
        String substring1 = s1.substring(1, s1.length() - 1);
        String substring2 = s.substring(0,1);
        String substring3 = s.substring(s.length()-1);
        int i = Integer.parseInt(substring);
        int i1 = Integer.parseInt(substring1);
        System.out.println(substring2+(i+i1)+substring3);
    }
}
