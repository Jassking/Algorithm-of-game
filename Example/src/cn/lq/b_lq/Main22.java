package cn.lq.b_lq;

import java.util.LinkedHashSet;
import java.util.Set;

/*一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成 的串。
例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。
注意在计算时，只算本质不同的串的个数。 请问，字符串0100110001010001 有多少个不同的非空子串？*/
public class Main22 {
    public static void main(String[] args) {
        Set<String> strings=new LinkedHashSet<>();//Set不能存重复的数据
        String s="0100110001010001";
        for (int i = 0; i < s.length(); i++) {//外层循环开始截取位置
            for (int j = i+1; j <=s.length(); j++) {//内层循环结束截取位置
                String a=s.substring(i,j);//返回一个新的子字符串
                strings.add(a);
            }
        }
        System.out.println(strings.size());
    }
}
