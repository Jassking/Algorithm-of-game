package cn.example.a_ex;
/*a��b���� 32λ ����ô��
    �ǵ�
�ҿ���ʹ��λ�����ô��
    ��Ȼ����
����
���� 1:
����:  a = 1, b = 2
���: 3
��������: ����a+b�Ľ��.
���� 2:
����:  a = -1, b = 1
���: 0
��������: ����a+b�Ľ��.
��ս
��Ȼ�����ֱ�� return a + b���������Ƿ������սһ�²�������������ʹ��+++�������������
*/

public class Main11 {
    public static void main(String[] args) {
      aplusb(1,3);
    }
    public static int aplusb(int a, int b) {
        if(a==0)return b;
        if(b==0)return a;
        int x1 = a^b;
        int x2 = (a&b)<<1;
        return aplusb(x1,x2);
    }
}
