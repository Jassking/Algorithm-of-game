package cn.example.c_lk.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main33 {
    public static void main(String[] args) {
        int[] startTime={9};
        int[] endTime={9};
        System.out.println(busyStudent(startTime,endTime,8));
    }
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int sum=0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i]<=queryTime&&endTime[i]>=queryTime){
                sum++;
            }
        }
        return sum;
    }
//    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
//        List<Integer> list=new ArrayList<>();
//        for (int i = 0; i < startTime.length; i++) {
//            if (startTime[i]<=queryTime){
//                list.add(i);
//            }
//        }
//        int index=0;
//        int sum=0;
//        int size = list.size();
//        for (int i = 0; i < endTime.length; i++) {
//            if (size>0){
//                size--;
//            }else {
//                return sum;
//            }
//            int integer = list.get(index);
//            if (endTime[integer]>=queryTime){
//                ++sum;
//                index++;
//            }else {
//                index++;
//            }
//        }
//        return sum;
//    }
}
