package cn.sf.b_jz;

/*���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������*/
public class Demo17 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode Merge(ListNode list1, ListNode list2) {
            //�ж�list1��list2Ϊ��
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }

            ListNode headNode;//����Ҫ���ص�������
            //ȷ��ͷ���
            if (list1.val > list2.val) {
                headNode = list2;
                list2 = list2.next;
            } else {
                headNode = list1;
                list1 = list1.next;
            }
            ListNode removeNode = headNode;//��ʵ�ڵ�ǰλ�þ��Ǻϳ�����ó���Ϊ1��ͷ�ڵ��β�ڵ���һ����
            //������������кϳ�
            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    removeNode.next = list2;//���ϳ������β���ڵ��������2�е�ǰ��ָ��Ľڵ�
                    removeNode = list2;//����β���ڵ㣬ʹβ���ڵ�ָ��list2
                    list2 = list2.next;
                } else {
                    removeNode.next = list1;
                    removeNode = list1;
                    list1 = list1.next;
                }
            }

            //�ж�list1��list2˭���нڵ�ͼ���ѭ��
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