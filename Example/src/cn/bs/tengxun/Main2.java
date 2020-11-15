package cn.bs.tengxun;

import java.util.Scanner;
import java.util.Stack;
/*6
add 1
add 2
add 3
peek
poll
peek*/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        for (int j = 0; j < q; j++) {
            String b = scanner.next();
            if (b.equals("add")) {
                stack.push(scanner.nextInt());
            }
            if (b.equals("poll")) {
                while (!stack.isEmpty()) {
                    stack1.push(stack.pop());
                }
                if (stack1.isEmpty()){
                    System.out.println(-1);
                }else {
                    stack1.pop();
                }
            }
            if (b.equals("peek")) {
                if (!stack1.isEmpty()) {
                    while (!stack.isEmpty()) {
                        stack1.push(stack.pop());
                    }
                    Integer pop = stack1.pop();
                    System.out.println(pop);
                    stack1.push(pop);
                }else {
                    System.out.println(-1);
                }
            }
        }
    }
}
