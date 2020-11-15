package cn.example.c_lk.b;
/*2. 两数相加

给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807

*/
public class Main28 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
/* 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
987 + 23 = 987 + 023 = 1010
*/
    public static void main(String[] args) {
        ListNode listNode=new ListNode(7);
        listNode.next=new ListNode(8);
        listNode.next.next=new ListNode(9);
        ListNode listNode2=new ListNode(3);
        listNode2.next=new ListNode(2);
//        while (listNode!=null) {
//            System.out.println(listNode.val);
//            listNode=listNode.next;
//        }
//        while (listNode2!=null) {
//            System.out.println(listNode2.val);
//            listNode2=listNode2.next;
//        }
        System.out.println(addTwoNumbers(listNode,listNode2));
    }
    /*将两个链表看成是相同长度的进行遍历，如果一个链表较短则在前面补 000，比如 987 + 23 = 987 + 023 = 1010
每一位计算的同时需要考虑上一位的进位问题，而当前位计算结束后同样需要更新进位值
如果两个链表全部遍历完毕后，进位值为 111，则在新链表最前方添加节点 111
小技巧：对于链表问题，返回结果为头结点时，通常需要先初始化一个预先指针 pre，该指针的下一个节点指向真正的头结点head。
使用预先指针的目的在于链表初始化时无可用节点值，而且链表构造过程需要指针移动，进而会导致头指针丢失，无法返回结果。
*/
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);//预先指针pre
        ListNode cur = pre;//cur链表也指向预先指针pre
        int carry = 0;//进位值；若为1，则表示存在进位，否则不存在进位
        while (l1 != null || l2 != null) {//判断两个链表是否全为空
            int x = l1 == null ? 0 : l1.val;//判断l1是否为空，为空则赋值为0；否则赋值为原来的值
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;//相加

            carry = sum / 10;//存储进位值
            sum = sum % 10;//计算实际的值
            cur.next = new ListNode(sum);//将实际的值存储到cur链表中下一个位置

            cur = cur.next;//移动cur链表使其指向下一个位置
            //将两个链表的位置向后移动一位
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry == 1) {//防止最后还存在进位值，若存在，则添加到cur链表中
            cur.next = new ListNode(carry);
        }
        //解释：https://leetcode-cn.com/problems/add-two-numbers/solution/hua-jie-suan-fa-2-liang-shu-xiang-jia-by-guanpengc/
        return pre.next;
    }
}
