package cn.example.c_lk.b;
/*2. �������

�������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�

��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�

�����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��

ʾ����

���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
�����7 -> 0 -> 8
ԭ��342 + 465 = 807

*/
public class Main28 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
/* ���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
�����7 -> 0 -> 8
ԭ��342 + 465 = 807
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
    /*����������������ͬ���ȵĽ��б��������һ������϶�����ǰ�油 000������ 987 + 23 = 987 + 023 = 1010
ÿһλ�����ͬʱ��Ҫ������һλ�Ľ�λ���⣬����ǰλ���������ͬ����Ҫ���½�λֵ
�����������ȫ��������Ϻ󣬽�λֵΪ 111��������������ǰ����ӽڵ� 111
С���ɣ������������⣬���ؽ��Ϊͷ���ʱ��ͨ����Ҫ�ȳ�ʼ��һ��Ԥ��ָ�� pre����ָ�����һ���ڵ�ָ��������ͷ���head��
ʹ��Ԥ��ָ���Ŀ�����������ʼ��ʱ�޿��ýڵ�ֵ�����������������Ҫָ���ƶ��������ᵼ��ͷָ�붪ʧ���޷����ؽ����
*/
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);//Ԥ��ָ��pre
        ListNode cur = pre;//cur����Ҳָ��Ԥ��ָ��pre
        int carry = 0;//��λֵ����Ϊ1�����ʾ���ڽ�λ�����򲻴��ڽ�λ
        while (l1 != null || l2 != null) {//�ж����������Ƿ�ȫΪ��
            int x = l1 == null ? 0 : l1.val;//�ж�l1�Ƿ�Ϊ�գ�Ϊ����ֵΪ0������ֵΪԭ����ֵ
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;//���

            carry = sum / 10;//�洢��λֵ
            sum = sum % 10;//����ʵ�ʵ�ֵ
            cur.next = new ListNode(sum);//��ʵ�ʵ�ֵ�洢��cur��������һ��λ��

            cur = cur.next;//�ƶ�cur����ʹ��ָ����һ��λ��
            //�����������λ������ƶ�һλ
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry == 1) {//��ֹ��󻹴��ڽ�λֵ�������ڣ�����ӵ�cur������
            cur.next = new ListNode(carry);
        }
        //���ͣ�https://leetcode-cn.com/problems/add-two-numbers/solution/hua-jie-suan-fa-2-liang-shu-xiang-jia-by-guanpengc/
        return pre.next;
    }
}
