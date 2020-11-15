package cn.example.c_lk.b;

import java.util.ArrayList;
import java.util.List;
/*1441. 用栈操作构建数组

给你一个目标数组 target 和一个整数 n。每次迭代，需要从  list = {1,2,3..., n} 中依序读取一个数字。

请使用下述操作来构建目标数组 target ：

    Push：从 list 中读取一个新元素， 并将其推入数组中。
    Pop：删除数组中的最后一个元素。
    如果目标数组构建完成，就停止读取更多元素。

题目数据保证目标数组严格递增，并且只包含 1 到 n 之间的数字。

请返回构建目标数组所用的操作序列。

题目数据保证答案是唯一的。



示例 1：

输入：target = [1,3], n = 3
输出：["Push","Push","Pop","Push"]
解释：
读取 1 并自动推入数组 -> [1]
读取 2 并自动推入数组，然后删除它 -> [1]
读取 3 并自动推入数组 -> [1,3]
*/
public class Main30 {
    public static void main(String[] args) {
        int[] num={} ;
        System.out.println(buildArray(num,4));
    }
    public static List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        if (target.length==0){//判断数组是否为空
            list.add("0");
            return list;
        }
        int index=0;
        for (int i = 1; i <= n; i++) {//list = {1,2,3..., n} 中依序读取一个数字
            for (int j = index; j < target.length; ) {//数组 target
                if (target[j]!=i){
                    list.add("Push");
                    list.add("Pop");
                    break;
                }else {
                    list.add("Push");
                    index=++j;//若相等，则跳到下一个数字进行比对
                    break;
                }
            }
        }
        return list;
    }
}
