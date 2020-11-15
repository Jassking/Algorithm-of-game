package cn.example.c_lk.a;
/*14. ���ֲ���
����һ��������������飨���򣩺�һ��Ҫ���ҵ�����target����O(logn)��ʱ����ҵ�target��һ�γ��ֵ��±꣨��0��ʼ�������target�������������У�����-1��
����
����  1:
	����:[1,4,4,5,7,7,8,9,9,10]��1
	���: 0
	��������:
	��һ�γ����ڵ�0��λ�á�
���� 2:
	����: [1, 2, 3, 3, 4, 5, 10]��3
	���: 2
	��������:
	��һ�γ����ڵ�2��λ��
���� 3:
	����: [1, 2, 3, 3, 4, 5, 10]��6
	���: -1
	��������:
	û�г��ֹ�6�� ����-1
��ս
��������е���������������2^32������㷨�Ƿ�����
*/
public class Main11 {
    public static void main(String[] args) {
        int[] a = {1, 4, 4, 5, 7, 7, 8, 9, 9, 10};
        System.out.println(binarySearch(a, 7));
    }

    public static int binarySearch(int[] nums, int target) {
        int end = nums.length - 1;
        int stat = 0;
        while (stat <= end) {
            int mid = (end + stat) / 2;
            if (nums[mid] < target) {
                stat = mid + 1;
            } else {
                end = mid-1;
            }
        }
        if (nums[stat] == target) {
            return stat;
        } else {
            return -1;
        }
    }
}