package cn.example.c_lk.a;
/*ͳ������
�������� k �� 0 �� n �еĳ��ֵĴ�����k ������ 0~9 ��һ��ֵ��
����
���� 1��
���룺
k = 1, n = 1
�����
1
���ͣ�
�� [0, 1] �У����Ƿ��� 1 ������ 1 �� (1)��
���� 2��
���룺
k = 1, n = 12
�����
5
���ͣ�
�� [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] �У����Ƿ��� 1 ������ 5 �� (1, 10, 11, 12)(ע��11��������1)��
*/
public class Main1 {
    public static void main(String[] args) {
        System.out.println(digitCounts(0,0));
    }
    public static int digitCounts(int k, int n) {
        int sum=0;
        for (int i = 0; i <= n; i++) {
            String s=i+"";
            for (int j = 0; j < s.length(); j++) {
                if(Integer.parseInt(String.valueOf(s.charAt(j)))==k){
                    sum++;
                }
            }
        }
        return sum;
    }
}
