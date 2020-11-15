package cn.example.c_lk.a;

import java.util.Arrays;
/*������56 - I. ���������ֳ��ֵĴ���*/
/*һ���������� nums �����������֮�⣬�������ֶ����������Ρ�
��д�����ҳ�������ֻ����һ�ε����֡�Ҫ��ʱ�临�Ӷ���O(n)���ռ临�Ӷ���O(1)��
ʾ�� 1��
���룺nums = [4,1,4,6]
�����[1,6] �� [6,1]
ʾ�� 2��
���룺nums = [1,2,10,4,1,4,3,3]
�����[2,10] �� [10,2]
���ƣ�
2 <= nums <= 10000
*/
public class Main19 {
    public static void main(String[] args) {
        int[ ] num={4,1,4,6};
        System.out.println(Arrays.toString(singleNumbers(num)));
    }
    public static int[] singleNumbers(int[] nums) {
        int[] n=new int[nums.length];
        int[] sum=new int[2];
        int index=0;
        Arrays.sort(nums);//�Ƚ�nums�����������
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (nums[i]!=n[j]) {
                    if (n[j] == 0) {//Ѱ��n������û�д����ݵ�λ�ý��в���
                        n[j] = nums[i];
                        break;
                    }
                }else {
                    n[j]=0;//�ж�nums�����д�����ͬ��Ԫ��ʱ����n[j]����
                    //ʣ��Ԫ����Ϊ��������
                    break;
                }
            }
        }
        //��n�����еĵ������ָ�ֵ������Ϊ2������
        for (int i = 0; i < n.length; i++) {
            if (n[i]!=0){
                sum[index]=n[i];
                index++;
            }
        }
        return sum;
    }
}
