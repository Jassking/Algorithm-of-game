package cn.example.a_ex;
/*2. β������
���һ���㷨�������n�׳���β����ĸ���
����
����  1:
	����: 11
	���: 2
	��������:
	11! = 39916800, ��β��0��2����
���� 2:
	����:  5
	���: 1
	��������:
	5! = 120�� ��β��0��1����
��ս
O(logN)��ʱ�临�Ӷ�*/
public class Main12 {
    public static void main(String[] args) {
        System.out.println(trailingZeros(50));
    }
    public static long trailingZeros(long n) {
       long sum=0;
       long temp=n/5;//�ж��м���5��β�����м���0
       while (temp!=0){
           sum+=temp;
           temp/=5;
       }
       return sum;
    }
}
