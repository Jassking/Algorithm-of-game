package cn.example.d_mianshi;

import java.lang.reflect.Array;


//class A {
//    public A(String str) {
//
//    }
//}
import java.util.*;
public class Main2 {
    public static boolean is(int[] array,int n){//�ж��Ƿ��ظ�
        for(int i=0;i<array.length;i++)
            if(array[i]==n) return true;
        return false;
    }
    public static int afs(int[] local,int []end){//�ҳ�ȡ����ֵ
        Arrays.sort(local);
        Arrays.sort(end);
        for (int i = 0; i < local.length; i++) {
            for (int j = i; j <= i; j++) {
                if (local[i]!=end[j]){
                    return local[i];
                }
            }
        }
        return -1;//û�з���-1
    }
    public static void main(String[] args) {
        Random r = new Random();
        int[] local = new int[100];//���100��
        int[] end = new int[99];//���99��
        int i = 0;
        int jq = 0;
        while (true) {
            int n = r.nextInt(101);//����1-100�������
            if (!is(local, n)) {
                local[i++] = n;
            }
            if (i >= 100) break;
        }
        int nnn = r.nextInt(101);//�������1����
        for (int j = 0; j < local.length; j++) {//��ԭ��local������ȡһ������
            if (local[j] != nnn) {
                end[jq++] = local[j];//����99����������
            }
        }
        System.out.println("ȡ����ֵ��"+afs(local, end));
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
//        System.out.println("ִ��");
//    }
