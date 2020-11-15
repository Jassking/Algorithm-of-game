package cn.example.c_lk.a;
/*4. 寻找两个有序数组的中位数
给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
你可以假设 nums1 和 nums2 不会同时为空。
示例 1:
nums1 = [1, 3]
nums2 = [2]
则中位数是 2.0
示例 2:
nums1 = [1, 2]
nums2 = [3, 4]
则中位数是 (2 + 3)/2 = 2.5
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main18 {
    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {};
        System.out.println(findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = 0;
        int len1 = 0;
        len = nums1.length;
        len1 = nums2.length;
        List<Integer> list=new ArrayList<>();
        double sum=0;
        if (len==0){//nums1 为空。
            if (len1==1){
                return nums2[0]*1.0;
            }
            for (int i = 0; i < len1; i++) {
                list.add(nums2[i]);
            }
            int lenth=list.size();
            int q=lenth/2;
            if (lenth%2==0){
                sum=(double) (list.get(q-1)+list.get(q))/2;
            }else {
                sum=(double) list.get(q);
            }
            return sum;
        }
        if (len1==0){//nums2为空。
            if (len==1){
                return nums1[0]*1.0;
            }
            for (int i = 0; i < len; i++) {
                list.add(nums1[i]);
            }
            int lenth=list.size();
            int q=lenth/2;
            if (lenth%2==0){
                sum=(double) (list.get(q-1)+list.get(q))/2;
            }else {
                sum=(double) list.get(q);
            }
            return sum;
        }
        //两个数组都不为空
        for (int i = 0; i < len; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < len1; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int lenth=list.size();
        int q=lenth/2;
        if (lenth%2==0){
            sum=(double) (list.get(q-1)+list.get(q))/2;
        }else {
            sum=(double) list.get(q);
        }
        return sum;
    }
}
