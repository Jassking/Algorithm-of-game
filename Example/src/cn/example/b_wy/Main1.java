package cn.example.b_wy;

import java.util.Scanner;

/*С��׼��ȥħ�������ɹ�ħ������,����ħ��������Ҫʹ��ħ����,����С������һöħ���Ҷ�û��,
����С������̨ħ����������ͨ��Ͷ��x(x����Ϊ0)��ħ���Ҳ��������ħ���ҡ�
ħ������1:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+1��ħ����
ħ������2:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+2��ħ����
С�ײɹ�ħ�������ܹ���Ҫn��ħ����,����С��ֻ��ͨ����̨ħ����������ǡ��n��ħ����,
С����Ҫ��������һ��Ͷ�뷽��ʹ�����ǡ��ӵ��n��ħ���ҡ�
��������:
�������һ��,����һ��������n(1 �� n �� 10^9),��ʾС����Ҫ��ħ����������
�������:
���һ���ַ���,ÿ���ַ���ʾ�ô�С��ѡȡͶ���ħ������������ֻ�����ַ�'1'��'2'��
��������1:
10
�������1:
122
*/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//�ɹ�ħ�������ܹ���Ҫn��ħ����
        StringBuffer stringBuffer=new StringBuffer();
        while (n>0){
            if (n%2==0){
                n=n/2-1;
                stringBuffer.append("2");
            }
            if (n%2==1){
                n=(n-1)/2;
                stringBuffer.append("1");
            }
        }
        System.out.println(stringBuffer.reverse());
    }
}
