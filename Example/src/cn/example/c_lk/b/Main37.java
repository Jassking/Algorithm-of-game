package cn.example.c_lk.b;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*��ָ Offer 42. ���������������
����һ���������飬������������Ҳ�и����������е�һ������������������һ�������顣������������ĺ͵����ֵ��

Ҫ��ʱ�临�Ӷ�ΪO(n)��
ʾ��1:
����: nums = [-2,1,-3,4,-1,2,1,-5,4]
���: 6
����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
��ʾ��

1 <= arr.length <= 10^5
-100 <= arr[i] <= 100
ע�⣺��������վ 53 ����ͬ��https://leetcode-cn.com/problems/maximum-subarray/*/
public class Main37 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=Math.max(nums[i],nums[i]+nums[i-1]);
        }
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){//Ѱ�����ֵ
            ans=Math.max(ans,nums[i]);
        }
        return ans;
    }
}
