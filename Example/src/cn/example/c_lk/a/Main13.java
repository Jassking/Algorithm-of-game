package cn.example.c_lk.a;

/*1258. 漂亮子数组
漂亮子数组的定义是具有 numOdds 个奇数元素的任何长度的数组。
给定一个由整数组成的数组 nums 以及一个整数 numOdds，找出该数组中所有的漂亮子数组。
只要子数组的开始索引以及结束索引不一样，那么这两个子数组就不一样。返回漂亮子数组的数量。
样例
示例 1:
输入:
nums = [1, 2, 3, 4, 5]
numOdds = 2
输出: 4
解释: 有4个子数组中含有两个奇数，例如:  [1, 2, 3], [1, 2, 3, 4], [2, 3, 4, 5], [3, 4, 5].
示例 2:
输入:
nums = [2, 4, 6, 8]
numOdds = 1
输出: 0
解释: 数组中没有奇数元素
注意事项
    nums 的数组长度范围是: [1, 100000]
    numOdds 的范围是: [1, 100000]
    保证返回的结果是int类型
*/
/*通过95%测试用例*/
public class Main13 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(BeautifulSubarrays(nums, 2));
    }

    public static int BeautifulSubarrays(int[] nums, int numOdds) {
        int length = nums.length;
        int sum = 0;
        int odd = 0;//奇数
        int residue = 0;//剩余的数
        int sumend = 0;//输出结果（返回漂亮子数组的数量）
        for (int i = 0; i < length; i++) {//计算总共有多少奇数
            if (nums[i] % 2 == 0) {
                sum++;//计算当前循环位置
                if (sum == length) {
                    return 0;
                }
            } else {
                odd++;
            }
        }
        int oddend = odd;//计算总共有多少奇数
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (nums[j] % 2 != 0) {
                    odd--;
                    residue++;
                    if (residue == numOdds) {//一旦奇数数量等于numOdds才相加
                        sumend++;
                    }
                } else {
                    if (residue == numOdds) {//奇数后面的是偶数也想加
                        sumend++;
                    }
                }
                if (j == length - 1) {//判断当前循环是否结束，若结束则恢复之前变量的值
                    odd = oddend;
                    residue = 0;
                }
            }
        }
        return sumend;
    }
}
