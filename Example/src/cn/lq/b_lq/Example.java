package cn.lq.b_lq;

import java.util.ArrayList;
import java.util.Scanner;

/*一个有序数列，序列中的每一个值都能够被2或者3或者5所整除，
这个序列的初始值从1开始，但是1并不在这个数列中。求第1500个值是多少？*/
public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = 0;
        for (int i = 2; i < 100000; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                arrayList.add(i);
                n++;
            }
            if (n == 1500)
                System.out.println(arrayList.toString());
        }
    }
}





