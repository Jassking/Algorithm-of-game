package cn.ty.f_thread;
//ʹ��synchronized���̰߳�ȫ���̹߳�Ʊ

import com.sun.source.tree.SynchronizedTree;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Text02 {
    static class MyThread extends Thread {
        static int count = 100;
        static TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        public MyThread(String name) {
            super(name);
        }

        Object object=new Object();
        @Override
        public void run() {
            synchronized (object) {
                while (count > 0) {
                    int c = count--;
                    System.out.println(this.getName() + "�����۳���" + c + "��Ʊ");
                }
            }
        }
//        public synchronized void method() {
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread("����1");
        Thread thread2 = new MyThread("����2");
        Thread thread3 = new MyThread("����3");
        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(4000);

        for (Map.Entry<Integer, String> entry : MyThread.treeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
