package cn.example.c_lk.a;

import java.util.ArrayList;
import java.util.List;
/*ˮ�ɻ����Ķ����ǣ������������ÿһλ���ϵ��ݴ�֮�� ��ά���ٿƵĶ���

����һ��3λ��ʮ��������153����һ��ˮ�ɻ�������Ϊ 153 = 13 + 53 + 33��

��һ��4λ��ʮ������1634Ҳ��һ��ˮ�ɻ�������Ϊ 1634 = 14 + 64 + 34 + 44��

����n���ҵ����е�nλʮ����ˮ�ɻ�����

�������ΪnС��8��
����

���� 1:

����: 1
���: [0,1,2,3,4,5,6,7,8,9]

���� 2:

����:  2
���: []
��������: û��2λ����ˮ�ɻ�����
*/
public class Main17 {
    public static void main(String[] args) {
        System.out.println(getNarcissisticNumbers(4));
    }
    public static List<Integer> getNarcissisticNumbers(int n) {
        List<Integer> list=new ArrayList<>();
        int base=1;
        if (n==1){//��n==1ʱ����һλ��
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
            return list;
        }
        while (n!=1){//ѭ���жϼ�λ���ĳ�ʼ����n==3,base=1000,��1000��ʼ���㣩
            --n;
            base*=10;
        }
        for (int i = base; i < base*10; i++) {
            if (pow(i)){//�ж��Ƿ���ˮ�ɻ���
                list.add(i);
            }
        }
        return list;
    }

    private  static boolean  pow(int i) {
        String string=String.valueOf(i);
        char[] chars = string.toCharArray();
        int sum=0;
        for (int j = 0; j < chars.length; j++) {
            sum+=(int)Math.pow(chars[j]-'0',chars.length);//Math.pow(x,y)�ɷ��� x �� y ���ݵ�ֵ��
        }
        if (sum==i){//�ж�ÿһλ������Ƿ����i
            return true;
        }
        return false;
    }
}
