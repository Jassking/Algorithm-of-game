package cn.example.c_lk.a;
/*����쳲����������е� N ������
��ν��쳲�����������ָ��
    ǰ2������ 0 �� 1 ��
    �� i �����ǵ� i-1 �����͵�i-2 �����ĺ͡�
쳲��������е�ǰ10�������ǣ�
0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
����  1:
	����:  1
	���: 0
	��������:
	����쳲������ĵ�һ�����֣���0.
���� 2:
	����:  2
	���: 1
	��������:
	����쳲������ĵڶ���������1.
*/
public class Main16 {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    public static int fibonacci(int n) {
        if (n==1){
            return 0;
        }
        if (n==3||n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
