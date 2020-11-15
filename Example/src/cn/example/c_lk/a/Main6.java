package cn.example.c_lk.a;
/*6. 合并排序数组 II
合并两个有序升序的整数数组A和B变成一个新的数组。新数组也要有序。
样例
样例 1:
输入: A=[1], B=[1]
输出:[1,1]
样例解释: 返回合并后的数组。
样例 2:
输入: A=[1,2,3,4], B=[2,4,5,6]
输出: [1,2,2,3,4,4,5,6]
样例解释: 返回合并后的数组。
挑战
你能否优化你的算法，如果其中一个数组很大而另一个数组很小？*/
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] A={3,10,31,40,46,88};
        int[] B={2,3,4,5,6,7,10,11,12,13,14,15,20,21,22,23,34,56,67,89,99,100,101,123,134,135,190,309,450};
        System.out.println(Arrays.toString(mergeSortedArray(A, B)));
    }
    public static int[] mergeSortedArray(int[] A, int[] B) {
        int len= A.length;
        int len1=B.length;
        int[] sum=new int[len+len1];
        int ans=0;
        for (int i = 0; i <len ; i++) {//先将A数组存入新数组中
            sum[i]=A[i];
            ans++;//记录A数组存储完后的下标索引
        }
        int index=0;
        for (int i = ans; i <sum.length; i++) {//从记录的下标索引开始插入数组B
            for (int j =index; j <len1;) {//从0开始，一直到B数组录入结束
                sum[i]=B[j];//开始录入数组B
                j++;//将数组B的下标向后移动一位
                index=j;//使得每次都会取得数组移动一位的值
                break;//防止sum数组中同一个位置的数值重复录入，导致数组B录入错误
            }
        }
        Arrays.sort(sum);//给新数组排序
        return sum;
    }
}
