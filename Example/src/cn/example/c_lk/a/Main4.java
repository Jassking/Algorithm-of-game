package cn.example.c_lk.a;
/*����֮��
��һ���������飬�ҵ�������ʹ�����ǵĺ͵���һ���������� target��
����Ҫʵ�ֵĺ���twoSum��Ҫ���������������±�, ���ҵ�һ���±�С�ڵڶ����±ꡣע�������±�ķ�Χ�� 0 �� n-1��
����
Example1:
���� numbers = [2, 7, 11, 15], target = 9, ���� [0, 1].
Example2:
���� numbers = [15, 2, 7, 11], target = 9, ���� [1, 2].
��ս
Either of the following solutions are acceptable:
    O(n) Space, O(nlogn) Time
    O(n) Space, O(n) Time
ע������
����Լ���ֻ��һ��𰸡�
*/
public class Main4 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] num=new int[2];
        if (numbers.length==0){
            return num;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target){
                    num[0]=i;
                    num[1]=j;
                }
            }
        }
        return num;
    }
}
