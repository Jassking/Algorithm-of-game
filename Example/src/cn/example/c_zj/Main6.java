package cn.example.c_zj;

import java.util.ArrayList;

/*53. ��������
����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�

ʾ��:

����: [-2,1,-3,4,-1,2,1,-5,4]
���: 6
����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
����:

������Ѿ�ʵ�ָ��Ӷ�Ϊ O(n) �Ľⷨ������ʹ�ø�Ϊ����ķ��η���⡣*/
public class Main6 {
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
    //��̬�滮https://leetcode-cn.com/problems/maximum-subarray/solution/shi-pin-tu-jie-zui-da-zi-xu-he-by-alchemist-5r/
    public static int maxSubArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            //������ǰһ��λ�õ����Ž��Ƿ�����㣬�����������������õ�ǰλ
            nums[i]=Math.max(nums[i],nums[i]+nums[i-1]);
        }
        int ans=nums[0];//ȡ�������е�һ��Ԫ��
        for (int i = 1; i < nums.length; i++) {
            //����һ��Ԫ�غ͵�ǰλ�����Ž������бȽ�
            ans=Math.max(ans,nums[i]);
        }
        return ans;
    }
}
