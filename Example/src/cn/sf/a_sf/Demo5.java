package cn.sf.a_sf;

import java.util.Stack;

/*������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�*/
/*ջ���Ƚ�������������Ƚ��ȳ�*/
public class Demo5 {
    Stack<Integer> stack1 = new Stack<Integer>();//push��ջ
    Stack<Integer> stack2 = new Stack<Integer>();//pop��ջ

    public void push(int node) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());//��stack2��ֵ��stack1��װ
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());//��stack1��ֵ��stack2��װ
        }
        return stack2.pop();
    }

}


