package cn.example.lqb.a2019;

import java.util.HashSet;
import java.util.Set;

/*
2.不同的子串：

    一个字符串的非空子串是指字符串中长度至少为1 的连续的一段字符组成
    的串。例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共7 个。
    注意在计算时，只算本质不同的串的个数。
    请问，字符串0100110001010001 有多少个不同的非空子串？

    这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一
    个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
*/
public class Main {
    public static void main(String[] args) {
        String s1 = "aaab";
        String s2 = "0100110001010001";
        System.out.println(subSum(s1));
        System.out.println(subSum(s2));
        int a[]=new int[5];
    }

    public static int subSum(String s) {
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i ; j < s.length(); j++) {
                //将每一个子串都加入到set集合中
                set.add(s.substring(i, j + 1 ));
            }
        }
        return set.size();
    }
}
