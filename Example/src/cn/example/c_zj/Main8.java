package cn.example.c_zj;
//5519. 重新排列单词间的空格
//给你一个字符串 text ，该字符串由若干被空格包围的单词组成。每个单词由一个或者多个小写英文字母组成，
// 并且两个单词之间至少存在一个空格。题目测试用例保证 text 至少包含一个单词 。
//
//请你重新排列空格，使每对相邻单词之间的空格数目都 相等 ，并尽可能 最大化 该数目。
// 如果不能重新平均分配所有空格，请 将多余的空格放置在字符串末尾 ，
// 这也意味着返回的字符串应当与原 text 字符串的长度相等。
//
//返回 重新排列空格后的字符串 。
//
//
//
//示例 1：
//
//输入：text = "  this   is  a sentence "
//输出："this   is   a   sentence"
//解释：总共有 9 个空格和 4 个单词。可以将 9 个空格平均分配到相邻单词之间，相邻单词间空格数为：9 / (4-1) = 3 个。
//示例 2：
//
//输入：text = " practice   makes   perfect"
//输出："practice   makes   perfect "
//解释：总共有 7 个空格和 3 个单词。7 / (3-1) = 3 个空格加上 1 个多余的空格。多余的空格需要放在字符串的末尾。
//示例 3：
//
//输入：text = "hello   world"
//输出："hello   world"
//示例 4：
//
//输入：text = "  walks  udp package   into  bar a"
//输出："walks  udp  package  into  bar  a "
//示例 5：
//
//输入：text = "a"
//输出："a"
//
//
//提示：
//
//1 <= text.length <= 100
//text 由小写英文字母和 ' ' 组成
//text 中至少包含一个单词
import java.util.Stack;

public class Main8 {
    public static void main(String[] args) {
        String s = "  w";
        System.out.println(reorderSpaces(s));
    }

    public static String reorderSpaces(String text) {
        int sum = 0;//空格数
        int ans = 0;//单词数
        for (int i = 0; i < text.length(); i++) {//统计总的空格数
            if (text.charAt(i) == ' ') {
                sum += 1;
            }
        }
        if (sum == 0) {//空格数为0，只有单词，直接输出
            return text;
        }
        Stack<Character> stack = new Stack<>();
        StringBuffer stats = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {//统计单词数
            if (text.charAt(i) != ' ') {
                stack.push(text.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    ans += 1;
                }
                while (!stack.isEmpty()) {//清空stack
                    stack.pop();
                }
            }
        }
        if (text.charAt(text.length() - 1) != ' ') {//判断最后一个是否为字母
            ans += 1;
        }
        if (ans == 1) {//判断只有一个单词
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != ' ') {
                    stats.append(text.charAt(i));
                }
            }
            for (int i = 0; i < sum; i++) {//将其他空格赋值到最后
                stats.append(' ');
            }
            return stats.toString();
        }
        int afs = sum / (ans - 1);//平均分配到相邻单词之间空格数
        int as = sum - (afs * (ans - 1));//多余的空格需要放在字符串的末尾
        char cc = ' ';
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        StringBuffer stringBuffer = new StringBuffer();
        String trim = text.trim();//去字符串首尾空格
        for (int i = 0; i < trim.length(); i++) {
            if (trim.charAt(i) != ' ') {
                stack1.push(trim.charAt(i));//判断是字母
            } else {
                if (trim.charAt(i) == ' ') {
                    stack2.push(trim.charAt(i));//将空格摘除到新的栈中
                }
                if (!stack1.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stringBuffer.append(stack1.pop());//将栈中的字母导入
                    }
                    for (int j = 0; j < afs; j++) {//将平均的空格数加入
                        stringBuffer.append(cc);
                    }
                }
            }
        }
        while (!stack1.isEmpty()) {//将最后一个单词加到队尾
            stringBuffer.append(stack1.pop());
        }
        for (int j = 0; j < as; j++) {//将多余的空格添加到队尾
            stringBuffer.append(cc);
        }
        Stack<Character> stack3 = new Stack<Character>();
        StringBuffer stringBuffer1 = new StringBuffer();
        //将单词矫正，呈正序
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) != ' ') {
                stack3.push(stringBuffer.charAt(i));
            }
            if (stringBuffer.charAt(i) == ' ') {
                while (!stack3.isEmpty()) {
                    stringBuffer1.append(stack3.pop());//利用栈的特性，将其导入再导出
                }
                stringBuffer1.append(' ');//每判断一次空格，都加上
            }
        }
        while (!stack3.isEmpty()) {//将最后一个单词加到最后
            stringBuffer1.append(stack3.pop());
        }
        return stringBuffer1.toString();
    }
}
