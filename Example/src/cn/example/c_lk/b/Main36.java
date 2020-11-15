package cn.example.c_lk.b;
/*������ 08.01. ��������
�������⡣�и�С��������¥�ݣ�¥����n��̨�ף�С��һ�ο�����1�ס�2�׻�3�ס�
ʵ��һ�ַ���������С���ж�������¥�ݵķ�ʽ��������ܴܺ�����Ҫ�Խ��ģ1000000007��

ʾ��1:

 ���룺n = 3
 �����4
 ˵��: �������߷�
ʾ��2:

 ���룺n = 5
 �����13
��ʾ:
n��Χ��[1, 1000000]֮��*/
public class Main36 {
    public static int waysToStep(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        if (n==3){
            return 4;
        }
        long[] ans=new long[n+1];
        ans[1]=1;
        ans[2]=2;
        ans[3]=4;
        for (int i = 4; i <= n; i++) {
            ans[i]=(ans[i-1]+ans[i-2]+ans[i-3])%1000000007;
        }
        return (int) ans[n];
    }

    public static void main(String[] args) {
        System.out.println(waysToStep(5));
    }
}
