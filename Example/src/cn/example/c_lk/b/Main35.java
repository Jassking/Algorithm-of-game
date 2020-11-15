package cn.example.c_lk.b;

import java.util.Stack;

/*20. 有效的括号
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。*/
public class Main35 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {//奇数个字符的字符串 显然无法完成括号匹配
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char theChar = s.charAt(i);//拿出当前字符串元素
            if (theChar == '{' || theChar == '[' || theChar == '(') {// 判断左括号
                stack.push(theChar);
            } else {
                //处理右括号
                if (stack.isEmpty()) { //栈中已无左括号，此时字符为右括号，无法匹配。
                    return false;
                }
                char preChar = stack.peek();//拿出当前栈顶的左括号
                //判断是否匹配
                if ((preChar == '{' && theChar == '}') || (preChar == '[' && theChar == ']') || (preChar == '(' && theChar == ')')) {
                    stack.pop();//匹配，则清除栈顶左括号
                } else {
                    return false;//不匹配，返回false
                }
            }
        }
        return stack.isEmpty();
    }
}