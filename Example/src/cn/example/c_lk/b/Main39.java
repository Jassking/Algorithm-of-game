package cn.example.c_lk.b;

import java.util.Arrays;
import java.util.Stack;
/*136. ֻ����һ�ε�����
����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
˵����
����㷨Ӧ�þ�������ʱ�临�Ӷȡ� ����Բ�ʹ�ö���ռ���ʵ����
ʾ�� 1:
����: [2,2,1]
���: 1
ʾ�� 2:
����: [4,1,2,1,2]
���: 4*/
public class Main39 {

    public static void main(String[] args) {
        int num[]={1,2,2};
        System.out.println(singleNumber(num));
    }
    //�ⷨһ���������
    public static int singleNumber(int[] nums) {
        int sum=0;
        for (int ans:nums) {
            sum=sum^ans;
        }
        return sum;
    }
    //����stack������
//    public static int singleNumber(int[] nums) {
//        Stack stack=new Stack();
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            stack.push(nums[i]);
//            if (!stack.isEmpty()) {
//                if (stack.peek().equals(nums[i+1])){
//                    stack.pop();
//                    i+=1;
//                }else{
//                    int sum= (int) stack.pop();
//                    return sum;
//                }
//            }
//        }
//        if (stack.isEmpty()){
//            return nums[nums.length-1];
//        }
//        return -1;
//    }
}
