package cn.example.c_lk.b;

/*121. ������Ʊ�����ʱ��
����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
��������ֻ�������һ�ʽ��ף������������һ֧��Ʊһ�Σ������һ���㷨�����������ܻ�ȡ���������
ע�⣺�㲻���������Ʊǰ������Ʊ��
ʾ�� 1:
����: [7,1,5,3,6,4]
���: 5
����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
     ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�ͬʱ���㲻��������ǰ������Ʊ��
ʾ�� 2:
����: [7,6,4,3,1]
���: 0
����: �����������, û�н������, �����������Ϊ 0��*/
public class Main40 {

    public static void main(String[] args) {
        int num[]={7,1,5,3,6,4};
        System.out.println(maxProfit(num));
    }
    public static int maxProfit(int[] prices) {
        if (prices.length<2){//��������
            return 0;
        }
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int i = 0; i < prices.length; i++) {
            min=Math.min(min,prices[i]);//����Сֵ
            max=Math.max(max,prices[i]-min);//�����ֵ
        }
        return max;
    }
}
