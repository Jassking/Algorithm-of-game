package cn.sf.a_sf;

import java.util.ArrayList;
import java.util.Stack;

public class Demo3 {
    /*����һ�������������β��ͷ��˳�򷵻�һ��ArrayList��*/
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
            stack.add(listNode.val);//��ArrayList��ǰ�Ľڵ��ֵ�ŵ�stack��
            listNode= listNode.next;//��ǰ�ڵ��ָ��ָ����һ���ڵ�
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());//��stack���ó��ڵ��ֵ�ŵ�ArrayList��
        }
        return list;
    }

}
