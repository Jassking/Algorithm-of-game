package cn.example.c_lk.a;
/*在数组中找到第 k 大的元素。*/
/*样例
样例 1：
输入：
n = 1, nums = [1,3,4,2]
输出：
4
样例 2：
输入：
n = 3, nums = [9,3,2,4,8]
输出：
4
挑战
要求时间复杂度为O(n)，空间复杂度为O(1)。
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
        List<Integer> list=new ArrayList<>();//正序
        List<Integer> list1=new ArrayList<>();//逆序
        for (int i = 0; i < nums.length; i++) {
           list.add(nums[i]);
        }
        Collections.sort(list);//给输入数据进行排序（正序）
        for (int i = list.size()-1; i >=0 ; i--) {
            list1.add(list.get(i));//将list集合中的数据进行倒序输入新的list1中存储（逆序）
        }
        for (int i = 0; i < list1.size(); i++) {
            return list1.get(n-1);//找到第 k 大的元素
        }
        return 0;
    }
}
