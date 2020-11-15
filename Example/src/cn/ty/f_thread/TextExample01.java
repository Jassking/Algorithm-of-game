package cn.ty.f_thread;
//ʹ��Runnable�ӿ���ʵ���̹߳�Ʊ
//        1. ����ʵ��Runnable�ӿڵ���
//        2. ʵ������run����
//        3. ��������Ķ���
//        4. ����һ��Thread���󣬲��ڹ���ʱ����ö���
//        5. �����̣߳�Thread�����start������
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TextExample01 {
    static class MyThread implements Runnable {
        static int count = 100;
        static SortedMap<Integer, String> treeMap = Collections.synchronizedSortedMap(new TreeMap<Integer, String>());

        @Override
        public void run() {
            while (count > 0) {
                int c = count--;
                System.out.println(Thread.currentThread().getName()+"���ڳ���:" + "��" + c + "��Ʊ");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(4000);

        for (Map.Entry<Integer,String> entry: MyThread.treeMap.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
