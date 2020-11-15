package cn.example.c_lk.b;
/*69. x 的平方根
实现 int sqrt(int x) 函数。
计算并返回 x 的平方根，其中 x 是非负整数。
由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
示例 1:
输入: 4
输出: 2
示例 2:
输入: 8
输出: 2
说明: 8 的平方根是 2.82842...,
     由于返回类型是整数，小数部分将被舍去。
*/
public class Main26 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        if (x==1){//判断是否等于1
            return 1;
        }
        if (x==0){//判断是否等于0
            return 0;
        }
        //二分法
        long stat=0;
        long end=x/2;//开平方数最大不会超过自身的一半；例子：9开平方根是3
        int sum=0;//结果
        while (stat<=end) {//判断二分法边界是否越界
            long mid = (stat + end) / 2;//求中间值
            if (mid*mid<=x){//判断中间值的平方数是否小于或等于他自身
                sum=(int)mid;//先将中间值赋值给结果
                stat=mid+1;//将开始值变成中间数加1
            }else{
                end=mid-1;//将结束值变成中间数加1
            }
        }
        return sum;
    }
}
