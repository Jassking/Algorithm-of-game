package cn.example.c_lk.b;
/*70. ��¥��
������������¥�ݡ���Ҫ n ������ܵ���¥����

ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�

ע�⣺���� n ��һ����������

ʾ�� 1��

���룺 2
����� 2
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 ��
2.  2 ��
ʾ�� 2��

���룺 3
����� 3
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 �� + 1 ��
2.  1 �� + 2 ��
3.  2 �� + 1 ��*/

public class Main34 {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }
//    //�ݹ�
//    public static int climbStairs(int n) {
//        if (n==1){
//            return 1;
//        }
//        if (n==2){
//            return 2;
//        }
//        return climbStairs(n-1)+climbStairs(n-2);
//    }
    //��̬�滮
    //1836311903
    public static int climbStairs(int n) {
        int[] nums =new int[n+2];
        nums[1]=1;
        nums[2]=2;
        for (int i = 3; i <= n; i++) {
            nums[i]=nums[i-1]+nums[i-2];
        }
        return nums[n];
    }
}
