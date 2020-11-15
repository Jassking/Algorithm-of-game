package cn.example.c_zj;

/*将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。?
示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
*/
public class Main5 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //递归法
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        if (l1.val <= l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        }else{
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }
    //递归法
    //递推法（链表的尾插法）
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;//将l1当前位赋值到新链表尾部
                l1 = l1.next;//l1的下一位覆盖l1当前位
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail=tail.next;//每赋值一位数字，就将其赋值到新链表中
        }
        tail.next = l1 == null ? l2 : l1;//判断最初两个链表和最后两个链表是否为空
        return head.next;
    }
}
