package cn.example.c_lk.a;
/*描述
实现一个栈，可以使用除了栈之外的数据结构
*/
import java.util.ArrayList;

public class Main22 {
    ArrayList<Integer> list=new ArrayList<>();
    public void push(int x) {
        list.add(x);
    }

    /*
     * @return: nothing
     */
    public void pop() {
        int size = list.size()-1;
        if (list.isEmpty()){
            System.out.println(-1);
        }else {
            list.remove(size);
        }
    }

    /*
     * @return: An integer
     */
    public int top() {
        int size = list.size()-1;
        return list.get(size);
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        if (list.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
