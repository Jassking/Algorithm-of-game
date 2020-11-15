package cn.sf.a_sf;

import java.util.Stack;

/*用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。*/
/*栈是先进后出；队列是先进先出*/
public class Demo5 {
    Stack<Integer> stack1 = new Stack<Integer>();//push入栈
    Stack<Integer> stack2 = new Stack<Integer>();//pop出栈

    public void push(int node) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());//把stack2的值往stack1里装
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());//把stack1的值往stack2里装
        }
        return stack2.pop();
    }

}


