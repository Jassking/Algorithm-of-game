package cn.lq.c_lq;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*第一题：组队
作为篮球队教练，你需要从以下名单中选出 1 号位至 5 号位各一名球员， 组成球队的首发阵容。
每位球员担任 1 号位至 5 号位时的评分如下表所示。请你计算首发阵容 1 号位至 5 号位的评分之和最大可能是多少？
（如果你把以上文字复制到文本文件中，请务必检查复制的内容是否与文 档中的一致。
在试题目录下有一个文件 team.txt，内容与上面表格中的相同， 请注意第一列是编号）
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一 个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。*/
/*答案：490*/
/*第二题：不同子串
一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成的串。
例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。 注意在计算时，只算本质不同的串的个数。
请问，字符串0100110001010001 有多少个不同的非空子串？
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。*/
//答案：100
public class Main35 {
    public static void main(String[] args) {
        Set<String> stringSet=new LinkedHashSet<>();
        String s="0100110001010001";
//        String s="aaab";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substring = s.substring(i,j);
                stringSet.add(substring);
            }
        }
        System.out.println(stringSet.toString());
        System.out.println(stringSet.size());
    }
}
