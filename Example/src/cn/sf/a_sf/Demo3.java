package cn.sf.a_sf;

import java.util.ArrayList;
import java.util.Stack;

public class Demo3 {
    /*输入一个链表，按链表从尾到头的顺序返回一个ArrayList。*/
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        while (listNode!=null){
            stack.add(listNode.val);//把ArrayList当前的节点的值放到stack中
            listNode= listNode.next;//当前节点的指针指向下一个节点
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());//从stack中拿出节点的值放到ArrayList中
        }
        return list;
    }

}
