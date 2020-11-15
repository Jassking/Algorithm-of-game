package cn.ty.f_thread;
//使用Runnable接口来实现线程购票
//        1. 定义实现Runnable接口的类
//        2. 实现它的run方法
//        3. 创建该类的对象
//        4. 构造一个Thread对象，并在构造时传入该对象
//        5. 启动线程（Thread对象的start方法）
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
                System.out.println(Thread.currentThread().getName()+"正在出售:" + "第" + c + "张票");
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
