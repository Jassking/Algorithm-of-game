package cn.sf.b_jz;
/*
����һ��������ת��������������ı�ͷ��
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
            ListNode first=removeNode.next;//���������ƶ��ڵ����һ���ڵ㣬��Ȼ�Ļ����ͻ���ɽڵ������޷������ƶ��������
            removeNode.next=firstNode;//ʵ�ַ�ת����
            //ʵ�������ڵ������ƽ�Ʋ�����
            firstNode=removeNode;
            removeNode=first;
        }
        head.next=null;
        return firstNode;
    }
}
