package cn.sf.a_sf;

/*一只青蛙一次可以跳上1级台阶，也可以跳上2级。
求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。*/
public class Demo8 {
    public int JumpFloor(int target) {
        //1.递归法
        /*if (target == 1) {
            return 1;
        }
        if (target == 2) {//return中第一个1：表示青蛙一次跳两阶；JumpFloor(target - 1)：表示青蛙一次调一阶
            return 1 + JumpFloor(target - 1);
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);*/

        //2.递推法
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 1 + JumpFloor(target - 1);
        }
        int[] a = new int[target + 1];// a[i] 代表从起点到第阶的总的情况数
        a[1] = 1;//第一阶总情况数是1
        a[2] = 2;//第二阶总情况数是2
        for (int i = 3; i <= target; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[target];
    }
}
