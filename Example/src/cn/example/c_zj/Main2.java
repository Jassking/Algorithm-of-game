package cn.example.c_zj;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Scanner;
/*
我叫王大锤，是一名特工。我刚刚接到任务：在字节跳动大街进行埋伏，抓捕恐怖分子孔连顺。
和我一起行动的还有另外两名特工，我提议
1. 我们在字节跳动大街的N个建筑中选定3个埋伏地点。
2. 为了相互照应，我们决定相距最远的两名特工间的距离不超过D。
我特喵是个天才! 经过精密的计算，我们从X种可行的埋伏方案中选择了一种。这个方案万无一失，颤抖吧，孔连顺！
……
万万没想到，计划还是失败了，孔连顺化妆成小龙女，混在cosplay的队伍中逃出了字节跳动大街。
只怪他的伪装太成功了，就是杨过本人来了也发现不了的！
请听题：给定N（可选作为埋伏点的建筑物数）、D（相距最远的两名特工间的距离的最大值）
以及可选建筑的坐标，计算在这次行动中，大锤的小队有多少种埋伏选择。
注意：
1. 两个特工不能埋伏在同一地点
2. 三个特工是等价的：即同样的位置组合(A, B, C) 只算一种埋伏方法，不能因“特工之间互换位置”而重复使用
输入描述:
第一行包含空格分隔的两个数字 N和D(1?≤?N?≤?1000000; 1?≤?D?≤?1000000)
第二行包含N个建筑物的的位置，每个位置用一个整数（取值区间为[0, 1000000]）表示，从小到大排列（将字节跳动大街看做一条数轴）

输出描述:
一个数字，表示不同埋伏方案的数量。结果可能溢出，请对 99997867 取模
示例1
输入
4 3
1 2 3 4
输出
4
说明
可选方案 (1, 2, 3), (1, 2, 4), (1, 3, 4), (2, 3, 4)
示例2
输入
5 19
1 10 20 30 50
输出
1
说明
可选方案 (1, 10, 20)*/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//N（可选作为埋伏点的建筑物数）
        int d = scanner.nextInt();//D（相距最远的两名特工间的距离的最大值）
        int[] index = new int[n];//含N个建筑物的的位置，每个位置用一个整数
        for (int i = 0; i < n; i++) {
            index[i] = scanner.nextInt();
        }
        long sum = 0;

        for (int i = 0, j = 0; i < index.length; i++) {
            while (i >= 2 && (index[i] - index[j]) > d){
                j++;
            }
            long q = (i - j);
            sum =sum+q*(q - 1) / 2;//前面有0到i-1共i个位置。i*（i-1)/2   种可能;
        }
        System.out.println(sum%99997867);
    }
}
