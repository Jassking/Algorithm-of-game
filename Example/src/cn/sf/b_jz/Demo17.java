package cn.sf.b_jz;

/*输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。*/
public class Demo17 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode Merge(ListNode list1, ListNode list2) {
            //判断list1和list2为空
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }

            ListNode headNode;//最终要返回的新链表
            //确定头结点
            if (list1.val > list2.val) {
                headNode = list2;
                list2 = list2.next;
            } else {
                headNode = list1;
                list1 = list1.next;
            }
            ListNode removeNode = headNode;//其实在当前位置就是合成链表得长度为1，头节点和尾节点是一样的
            //将两个链表进行合成
            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    removeNode.next = list2;//将合成链表的尾部节点添加链表2中当前所指向的节点
                    removeNode = list2;//更新尾部节点，使尾部节点指向list2
                    list2 = list2.next;
                } else {
                    removeNode.next = list1;
                    removeNode = list1;
                    list1 = list1.next;
                }
            }

            //判断list1和list2谁还有节点就继续循环
            while (list1 != null) {
                removeNode.next = list1;
                removeNode = list1;
                list1 = list1.next;
            }

            while (list2 != null) {
                removeNode.next = list2;
                removeNode = list2;
                list2 = list2.next;
            }

            return headNode;
        }
    }
}