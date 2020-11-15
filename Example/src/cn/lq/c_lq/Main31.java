package cn.lq.c_lq;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*小明对类似于 hello 这种单词非常感兴趣，这种单词可以正好分为四段，
第一段由一个或多个辅音字母组成，
第二段由一个或多个元音字母组成，
第三段由一个或多个辅音字母组成，
第四段由一个或多个元音字母组成。
　　给定一个单词，请判断这个单词是否也是这种单词，如果是请输出yes，否则请输出no。
　　元音字母包括 a, e, i, o, u，共五个，其他均为辅音字母。
输入格式
　　输入一行，包含一个单词，单词中只包含小写英文字母。
输出格式
　　输出答案，或者为yes，或者为no。*/
public class Main31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Set<Character> setYes = new LinkedHashSet<>();
        Set<Character> setNo = new LinkedHashSet<>();
        for (char i = 'a'; i <= 'z'; i++) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                setYes.add(i);
            } else {
                setNo.add(i);
            }
        }
        int n = 0;
        int q = 0;
        int w = 0;
        int e = 0;
        int r = 0;
        while (n < s.length() && setNo.contains(s.charAt(n))) {
            q = 1;
            n++;
        }
        while (n < s.length() && setYes.contains(s.charAt(n))) {
            w = 1;
            n++;
        }
        while (n < s.length() && setNo.contains(s.charAt(n))) {
            e = 1;
            n++;
        }
        while (n < s.length() && setYes.contains(s.charAt(n))) {
            r = 1;
            n++;
        }
        if (q < s.length() && q == 1 && w == 1 && e == 1 && r == 1) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
