package cn.sf.b_jz;
/*
输入一个链表，反转链表后，输出新链表的表头。
*/
public class Demo15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode firstNode=head;
        ListNode removeNode=head.next;
        while (removeNode!=null){
            ListNode first=removeNode.next;//用来保存移动节点的下一个节点，不然的话，就会造成节点最终无法往右移动的情况。
            removeNode.next=firstNode;//实现反转链表
            //实现两个节点的向右平移操作。
            firstNode=removeNode;
            removeNode=first;
        }
        head.next=null;
        return firstNode;
    }
}
