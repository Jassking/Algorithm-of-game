package cn.ty.f_thread;
//初步实现线程购票
import java.util.Map;
import java.util.TreeMap;

public class Text {
    static class MyThread extends Thread{
        static int count=100;
        static TreeMap<Integer,String> treeMap=new TreeMap<Integer, String>();
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {

            while (count>0){
                System.out.println(this.getName()+"正在售出："+count--+"张票");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new MyThread("窗口1");
        Thread thread2=new MyThread("窗口2");
        Thread thread3=new MyThread("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(2000);

        for (Map.Entry<Integer,String> entry:MyThread.treeMap.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
