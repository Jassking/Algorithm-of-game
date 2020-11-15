package cn.example.c_lk.a;
/*1476. 山形数组的顶峰坐标
中文
English

我们把符合下列属性的数组 A 称作山脉：

A.length >= 3
存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
样例

样例 1:

输入: [0,1,0]
输出: 1

样例 2:

输入: [0,2,1,0]
输出: 1

注意事项

1.3 <= A.length <= 10000
2.0 <= A[i] <= 10^6
*/
public class Main21 {
    public static void main(String[] args) {
        int[] num={3,4,5,1};
        System.out.println(peakIndexInMountainArray(num));
    }
    public static int peakIndexInMountainArray(int[] A) {
        int sum=0;
        if (A.length<3){
            return 0;
        }
        for (int i = 1; i < A.length-1; i++) {
            if (A[i-1]<A[i]){
                if (A[i]>A[i+1]){
                    return i;
                }
            }
        }
        return 0;
    }
}
