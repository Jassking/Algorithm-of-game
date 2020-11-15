package cn.example.a_ex;
/*编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
示例 1:
输入: ["flower","flow","flight"]
输出: "fl"
示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:
所有输入只包含小写字母 a-z 。
*/

public class Main6 {
    public static void main(String[] args) {
        String[] n = {"flower", "flow"};
        System.out.println(longestCommonPrefix(n));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if ( i == strs[j].length()||strs[j].charAt(i) != c) {
                    /*strs[j].charAt(i) != c这个条件要放在||后面，因为最后一个数根本不存在，放前面会报错*/
                    /*if会先判断第一个条件是否满足，不满足才会判断第二个条件*/
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
