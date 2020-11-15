package cn.example.c_lk.b;

import java.util.Stack;

/*155. ��Сջ
���һ��֧�� push ��pop ��top �����������ڳ���ʱ���ڼ�������СԪ�ص�ջ��
    push(x) ���� ��Ԫ�� x ����ջ�С�
    pop() ���� ɾ��ջ����Ԫ�ء�
    top() ���� ��ȡջ��Ԫ�ء�
    getMin() ���� ����ջ�е���СԪ�ء�
ʾ��:
���룺
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]
�����
[null,null,null,null,-3,null,0,-2]
���ͣ�
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> ���� -3.
minStack.pop();
minStack.top();      --> ���� 0.
minStack.getMin();   --> ���� -2.
��ʾ��
    pop��top �� getMin ���������� �ǿ�ջ �ϵ��á�

*/
public class Main31 {
    public static void main(String[] args) {

    }

    /**
     * initialize your data structure here.
     */
    class MinStack {
        private Stack<Integer> minStack;
        private Stack<Integer> stack;

        public MinStack() {
            minStack = new Stack<>();
            stack = new Stack<>();
        }

        public void push(int x) {
                stack.push(x);
            if (!minStack.isEmpty()) {
                int top = minStack.peek();
                //С�ڵ�ʱ�����ջ
                if (x <= top) {
                    minStack.push(x);
                }
            }else{
                minStack.push(x);
            }
        }

        public void pop() {
            int p = stack.pop();
            if (p==minStack.peek() ) {
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
