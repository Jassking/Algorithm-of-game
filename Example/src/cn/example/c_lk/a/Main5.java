package cn.example.c_lk.a;
/*���������ҵ��� k ���Ԫ�ء�*/
/*����
���� 1��
���룺
n = 1, nums = [1,3,4,2]
�����
4
���� 2��
���룺
n = 3, nums = [9,3,2,4,8]
�����
4
��ս
Ҫ��ʱ�临�Ӷ�ΪO(n)���ռ临�Ӷ�ΪO(1)��
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        int[] nums={1,3,4,2};
        System.out.println(kthLargestElement(2,nums));
    }
    public static int kthLargestElement(int n, int[] nums) {
        List<Integer> list=new ArrayList<>();//����
        List<Integer> list1=new ArrayList<>();//����
        for (int i = 0; i < nums.length; i++) {
           list.add(nums[i]);
        }
        Collections.sort(list);//���������ݽ�����������
        for (int i = list.size()-1; i >=0 ; i--) {
            list1.add(list.get(i));//��list�����е����ݽ��е��������µ�list1�д洢������
        }
        for (int i = 0; i < list1.size(); i++) {
            return list1.get(n-1);//�ҵ��� k ���Ԫ��
        }
        return 0;
    }
}
