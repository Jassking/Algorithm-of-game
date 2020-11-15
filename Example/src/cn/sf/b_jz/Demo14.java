package cn.sf.b_jz;

/*输入一个链表，输出该链表中倒数第k个结点。*/
public class Demo14 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    private int sum;//记录当前节点是倒数第几个结点
    private ListNode ans;//最后返回的结果

    public ListNode FindKthToTail(ListNode head, int k) {
        //方法1
        /*if (head == null) {//当链表为null时，直接返回null
            return null;
        }

        ListNode removrNode = head;//定义一个新节点，让其指向head的位置
        while (k != 0) {//这个循环使得removrNode和head两个指针相距k个距离
            if (removrNode == null) {
                return null;
            }
            removrNode = removrNode.next;
            k--;
        }
        //使两个指针向后移动，当前面的指针removrNode指到最后一个节点时，head指针所指的位置就是该链表中倒数第k个结点的位置
        while (removrNode != null) {
            removrNode = removrNode.next;
            head = head.next;
        }
        return head;*/
        //方法2,递归法
        sum = 0;
        ans = null;
        if (head == null) {
            return null;
        }
        afs(head, k);
        return ans;

    }

    private void afs(ListNode head, int k) {
        if (head.next != null) {
            afs(head.next, k);
        }
        sum++;
        if (sum == k) {
            ans = head;
        }
    }
}
