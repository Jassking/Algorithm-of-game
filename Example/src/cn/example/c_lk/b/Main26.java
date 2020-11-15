package cn.example.c_lk.b;
/*69. x ��ƽ����
ʵ�� int sqrt(int x) ������
���㲢���� x ��ƽ���������� x �ǷǸ�������
���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
ʾ�� 1:
����: 4
���: 2
ʾ�� 2:
����: 8
���: 2
˵��: 8 ��ƽ������ 2.82842...,
     ���ڷ���������������С�����ֽ�����ȥ��
*/
public class Main26 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        if (x==1){//�ж��Ƿ����1
            return 1;
        }
        if (x==0){//�ж��Ƿ����0
            return 0;
        }
        //���ַ�
        long stat=0;
        long end=x/2;//��ƽ������󲻻ᳬ�������һ�룻���ӣ�9��ƽ������3
        int sum=0;//���
        while (stat<=end) {//�ж϶��ַ��߽��Ƿ�Խ��
            long mid = (stat + end) / 2;//���м�ֵ
            if (mid*mid<=x){//�ж��м�ֵ��ƽ�����Ƿ�С�ڻ����������
                sum=(int)mid;//�Ƚ��м�ֵ��ֵ�����
                stat=mid+1;//����ʼֵ����м�����1
            }else{
                end=mid-1;//������ֵ����м�����1
            }
        }
        return sum;
    }
}
