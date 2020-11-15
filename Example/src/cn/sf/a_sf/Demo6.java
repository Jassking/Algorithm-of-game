package cn.sf.a_sf;

public class Demo6 {
    /*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。*/
    public int minNumberInRotateArray(int[] array) {
        //使用暴力法
        if (array.length == 0) {
            return 0;
        }
        int ans=array[0];
        for (int i = 1; i < array.length; i++) {
            ans=Math.min(ans,array[i]);//找出 ans 和 array[i] 的最小值，并把它赋值给 ans
        }
        return ans;


        //使用二分法
       /* if (array.length == 0) {
            return 0;
        }
        int l = 0;//左边
        int r = array.length-1;//右边
        while (l < r - 1) {//当右边的指针跑到左边的指针的左边
            int mid = (l + r) / 2;//计算当前中间的值
            if (array[mid] >= array[l]) {//当中间的值大于等于左边的值时
                l = mid;//左指针移动到中间值的下标
            } else if (array[mid] <= array[r]) {//当中间的值小于等于右边的值时
                r = mid;//右指针移动到中间值的下标
            }
        }
        return array[r];*/
    }
}
