package cn.bs.guanglianda;

public class Main1 {
    public  class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head) {
        int len=getlen(head);
        int ans=len/2;//计算中间节点
        ListNode node=head;
        if (ans%2==1) {
            for (int i = 0; i < ans; i++) {
                node = node.next;
            }
        }else {
            for (int i = 0; i < ans; i++) {
                node = node.next;
            }
            return node;
        }
        return node;
    }

    private int getlen(ListNode head) {//计算链表长度
        int len=0;
        for (ListNode length=head; length!=null ;length=length.next) {
            len++;
        }
        return len;
    }
}
