package cn.example.c_lk.b;
/*5396. 连续字符
给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。

请你返回字符串的能量。



示例 1：

输入：s = "leetcode"
输出：2
解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
示例 2：

输入：s = "abbcccddddeeeeedcba"
输出：5
解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
示例 3：

输入：s = "triplepillooooow"
输出：5
示例 4：

输入：s = "hooraaaaaaaaaaay"
输出：11
示例 5：

输入：s = "tourist"
输出：1


提示：

1 <= s.length <= 500
s 只包含小写英文字母。*/

public class Main32 {
    public static void main(String[] args) {
        System.out.println(maxPower("b"));
    }
    public static int maxPower(String s) {
        char[] chars = s.toCharArray();
        if (s.isEmpty()){
            return 0;
        }
        if (s.length()==1){
            return 1;
        }
        char c=chars[0];//拿到第一个数字
        int count=1;//非空子字符串的长度长度最少为1
        int maxLen=0;//记录最长非空子字符串的长度
        for (int i = 1; i < chars.length; i++) {
            if (c==chars[i]){//判断当前字符是否与下一个字符相等
                ++count;
            }else {
                c=chars[i];//不相等，则把下一个字符赋值给当前字符
                count=1;//重新将非空子字符串的长度长度最少为1
            }
            maxLen=Math.max(count,maxLen);
        }
        return maxLen;
    }
}
