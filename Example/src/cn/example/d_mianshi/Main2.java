package cn.example.d_mianshi;

import java.lang.reflect.Array;


//class A {
//    public A(String str) {
//
//    }
//}
import java.util.*;
public class Main2 {
    public static boolean is(int[] array,int n){//判断是否重复
        for(int i=0;i<array.length;i++)
            if(array[i]==n) return true;
        return false;
    }
    public static int afs(int[] local,int []end){//找出取出的值
        Arrays.sort(local);
        Arrays.sort(end);
        for (int i = 0; i < local.length; i++) {
            for (int j = i; j <= i; j++) {
                if (local[i]!=end[j]){
                    return local[i];
                }
            }
        }
        return -1;//没有返回-1
    }
    public static void main(String[] args) {
        Random r = new Random();
        int[] local = new int[100];//随机100数
        int[] end = new int[99];//随机99数
        int i = 0;
        int jq = 0;
        while (true) {
            int n = r.nextInt(101);//产生1-100的随机数
            if (!is(local, n)) {
                local[i++] = n;
            }
            if (i >= 100) break;
        }
        int nnn = r.nextInt(101);//随机产生1个数
        for (int j = 0; j < local.length; j++) {//将原来local数组中取一个数字
            if (local[j] != nnn) {
                end[jq++] = local[j];//生成99个数的数组
            }
        }
        System.out.println("取出的值："+afs(local, end));
    }
}

//    public static void main(String[] args) {
//        int i = 10;
//        int j=9;
//        System.out.println(--i);
//        System.out.println(j++);
//    }

//    public static void main(String args[]) {
//        int i = 7;
//        do {
//            System.out.println(--i);
//            --i;
//        } while (i != 0);
//        System.out.println(i);
//    }


//    public static void main(String[] args) {
//        Thread t = new Thread() {
//
//            public void run() {
//                my360DW();
//            }
//        };
//
//        t.run();
//        System.out.print("DW");
//
//    }
//
//    static void my360DW() {
//
//        System.out.print("360");
//
//    }

//    public static void main(String[] args) {
//        A classa = new A("he");
//        A classb = new A("he");
//        System.out.println(classa == classb);
//    }


//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                doStuff();
//                System.out.println(1);
//
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                doStuff();
//                System.out.println(2);
//
//            }
//        }).run();
//        new Thread(){
//            public void run() {
//                doStuff();
//                System.out.println(3);
//
//            }
//        }.start();
//    }
//    public static void  doStuff(){
//        System.out.println("执行");
//    }
