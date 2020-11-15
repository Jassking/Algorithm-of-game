package cn.example.c_zj;

/*��������������ϲ�Ϊһ���µ� ���� �������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ�?
ʾ����
���룺1->2->4, 1->3->4
�����1->1->2->3->4->4
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

    //�ݹ鷨
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
    //�ݹ鷨
    //���Ʒ��������β�巨��
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;//��l1��ǰλ��ֵ��������β��
                l1 = l1.next;//l1����һλ����l1��ǰλ
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail=tail.next;//ÿ��ֵһλ���֣��ͽ��丳ֵ����������
        }
        tail.next = l1 == null ? l2 : l1;//�ж�������������������������Ƿ�Ϊ��
        return head.next;
    }
}
