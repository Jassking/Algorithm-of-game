package cn.example.c_lk.a;
/*14. 二分查找
给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。
样例
样例  1:
	输入:[1,4,4,5,7,7,8,9,9,10]，1
	输出: 0
	样例解释:
	第一次出现在第0个位置。
样例 2:
	输入: [1, 2, 3, 3, 4, 5, 10]，3
	输出: 2
	样例解释:
	第一次出现在第2个位置
样例 3:
	输入: [1, 2, 3, 3, 4, 5, 10]，6
	输出: -1
	样例解释:
	没有出现过6， 返回-1
挑战
如果数组中的整数个数超过了2^32，你的算法是否会出错？
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