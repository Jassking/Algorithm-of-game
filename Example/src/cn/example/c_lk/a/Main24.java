package cn.example.c_lk.a;

import java.util.HashSet;
import java.util.Set;
/*202. ������

��дһ���㷨���ж�һ���� n �ǲ��ǿ�������

��������������Ϊ������һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�Ȼ���ظ��������ֱ���������Ϊ 1��Ҳ������ ����ѭ�� ��ʼ�ձ䲻�� 1����� ���Ա�Ϊ  1����ô��������ǿ�������

��� n �ǿ������ͷ��� True �����ǣ��򷵻� False ��



ʾ����

���룺19
�����true
���ͣ�
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

*/
public class Main24 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        if (n==1){
            return true;
        }
        set.add(n);
        int sum=0;//ÿ�����ƽ���ĺ�
        int num = 0;
        while (sum!=1){
            sum=0;
            while (n!=0){
                num = n%10;//���λ������
                n/=10;//ÿ�ΰѸ�λ������ȥ��
                sum+=num*num;//ƽ����
            }
            if (set.contains(sum)){//�ж��Ƿ������ͬ��������������������ѭ��
                return false;
            }else {
                set.add(sum);
            }
            n=sum;
        }
        return true;
    }
}
