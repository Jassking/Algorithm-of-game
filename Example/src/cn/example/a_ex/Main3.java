package cn.example.a_ex;

import java.util.Scanner;

/* ��vivo�����ϣ�ÿλְ�����Ŷ��ֻ��ӹ�������ʶ����Ϥ�;�������ӣ��ղ���Ҳ�᲻��������
�����һ������1̨��������2��(���ڶ�������)ÿ������2����������3��(�����ġ��塢����)ÿ������3�� ... ...
�Դ����ƣ����̼������n���ܹ������������ֻ������� */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        int temp=0;
        for (int i = 1; i <= n; i++) {
            if (i==1){
                temp=i;
                n-=1;
            }else {
                sum=i*i;
                n-=i;
            }
            temp+=sum;
        }
        int sqrt =(int) Math.sqrt(sum)+1;
        sum=n*sqrt;
        temp+=sum;
        System.out.println(temp);
    }
}
