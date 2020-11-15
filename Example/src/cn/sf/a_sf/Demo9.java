package cn.sf.a_sf;

/*一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。*/
public class Demo9 {
    public int JumpFloorII(int target) {
        //1.递推法
        if (target == 1) {
            return 1;
        }
        int[] a = new int[target + 1];
        int sum = 1;//设置一个sum变量去记录1到n-1阶的总的情况数
        for (int i = 2; i <= target; i++) {
            a[i] = sum + 1;//对于第i阶台阶他是等于从第1阶到第i-1阶台阶的情况数之和然后再加上1(从起点到i阶的情况)
            sum = sum + a[i];//更新1到i阶的情况数
        }
        return a[target];
    }
}
