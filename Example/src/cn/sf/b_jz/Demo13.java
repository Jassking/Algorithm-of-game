package cn.sf.b_jz;

import java.util.ArrayList;

/*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。*/
public class Demo13 {
    public void reOrderArray(int[] array) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();//存储奇数
        ArrayList<Integer> arrayList2 = new ArrayList<>();//存储偶数
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayList1.add(array[i]);
            }else {
                arrayList2.add(array[i]);
            }
        }
        //将所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分
        int index=0;//记录数组下标
        for (int i : arrayList1) {//循环从arrayList1集合中拿出一个数赋值给i
            array[index++]=i;//将arrayList1中的数据依次增加到array数组中
        }
        for (int i : arrayList2) {//循环从arrayList2集合中拿出一个数赋值给i
            array[index++]=i;//将arrayList1中的数据依次增加到array数组中
        }
    }
}
