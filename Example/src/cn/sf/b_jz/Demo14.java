package cn.sf.b_jz;

/*����һ����������������е�����k����㡣*/
public class Demo14 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    private int sum;//��¼��ǰ�ڵ��ǵ����ڼ������
    private ListNode ans;//��󷵻صĽ��

    public ListNode FindKthToTail(ListNode head, int k) {
        //����1
        /*if (head == null) {//������Ϊnullʱ��ֱ�ӷ���null
            return null;
        }

        ListNode removrNode = head;//����һ���½ڵ㣬����ָ��head��λ��
        while (k != 0) {//���ѭ��ʹ��removrNode��head����ָ�����k������
            if (removrNode == null) {
                return null;
            }
            removrNode = removrNode.next;
            k--;
        }
        //ʹ����ָ������ƶ�����ǰ���ָ��removrNodeָ�����һ���ڵ�ʱ��headָ����ָ��λ�þ��Ǹ������е�����k������λ��
        while (removrNode != null) {
            removrNode = removrNode.next;
            head = head.next;
        }
        return head;*/
        //����2,�ݹ鷨
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
