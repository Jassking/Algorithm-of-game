package cn.sf.a_sf;
/*我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？*/

public class Demo10 {
    public int RectCover(int target) {
        //1.递推法
        /*if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int[] a = new int[target + 1];
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i <= target; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[target];*/

        //2.递归法
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }
}
