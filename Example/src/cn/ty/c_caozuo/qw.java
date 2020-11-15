package cn.ty.c_caozuo;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class qw {
    public static final int MAX_SIZE = 2;
    public static LinkedList<Integer> list = new LinkedList<>();
    public static Lock lock = new ReentrantLock();
    //空间满的条件变量
    public static Condition full = lock.newCondition();
    //空间为空的条件变量
    public static Condition empty = lock.newCondition();
    class Producer implements Runnable {
        @Override
        public void run() {
            lock.lock();
            while (list.size() == MAX_SIZE) {
                try {
                    System.out.println("空间已满，生产者" + Thread.currentThread().getName() + "不可生产.");
                    full.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(1);
            System.out.println("生产者" + Thread.currentThread().getName() + "生产, 空间容量为" + list.size());
            //唤醒其他生产者与消费者线程
            full.signal();
            empty.signal();
            lock.unlock();
        }
    }
    class Consumer implements Runnable {

        @Override
        public void run() {
            lock.lock();
            while (list.size() == 0) {
                try {
                    System.out.println("空间为空，消费者" + Thread.currentThread().getName() + "不可消费.");
                    empty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.removeFirst();
            System.out.println("消费者" + Thread.currentThread().getName() + "消费，空间容量为" + list.size());
            //唤醒其他生产者与消费者线程
            full.signal();
            empty.signal();
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        cn.ty.c_caozuo.qw proAndCon = new cn.ty.c_caozuo.qw();
        Producer producer = proAndCon.new Producer();
        Consumer consumer = proAndCon.new Consumer();
        for (int i = 0; i < 10; i++) {
            Thread pro = new Thread(producer);
            pro.start();
            Thread con = new Thread(consumer);
            con.start();
        }
    }
}