package cn.example.c_lk.b;

import java.util.Stack;

/*20. ��Ч������
����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��

��Ч�ַ��������㣺

�����ű�������ͬ���͵������űպϡ�
�����ű�������ȷ��˳��պϡ�
ע����ַ����ɱ���Ϊ����Ч�ַ�����*/
public class Main35 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {//�������ַ����ַ��� ��Ȼ�޷��������ƥ��
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char theChar = s.charAt(i);//�ó���ǰ�ַ���Ԫ��
            if (theChar == '{' || theChar == '[' || theChar == '(') {// �ж�������
                stack.push(theChar);
            } else {
                //����������
                if (stack.isEmpty()) { //ջ�����������ţ���ʱ�ַ�Ϊ�����ţ��޷�ƥ�䡣
                    return false;
                }
                char preChar = stack.peek();//�ó���ǰջ����������
                //�ж��Ƿ�ƥ��
                if ((preChar == '{' && theChar == '}') || (preChar == '[' && theChar == ']') || (preChar == '(' && theChar == ')')) {
                    stack.pop();//ƥ�䣬�����ջ��������
                } else {
                    return false;//��ƥ�䣬����false
                }
            }
        }
        return stack.isEmpty();
    }
}