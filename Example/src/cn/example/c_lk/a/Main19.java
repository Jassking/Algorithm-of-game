package cn.example.c_lk.a;

import java.util.Arrays;
/*面试题56 - I. 数组中数字出现的次数*/
/*一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
示例 1：
输入：nums = [4,1,4,6]
输出：[1,6] 或 [6,1]
示例 2：
输入：nums = [1,2,10,4,1,4,3,3]
输出：[2,10] 或 [10,2]
限制：
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
        Arrays.sort(nums);//先将nums数组进行排序
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (nums[i]!=n[j]) {
                    if (n[j] == 0) {//寻找n数组中没有存数据的位置进行插入
                        n[j] = nums[i];
                        break;
                    }
                }else {
                    n[j]=0;//判断nums数组中存在相同的元素时，将n[j]置零
                    //剩余元素则为单个数字
                    break;
                }
            }
        }
        //将n数组中的单个数字赋值给长度为2的数组
        for (int i = 0; i < n.length; i++) {
            if (n[i]!=0){
                sum[index]=n[i];
                index++;
            }
        }
        return sum;
    }
}
