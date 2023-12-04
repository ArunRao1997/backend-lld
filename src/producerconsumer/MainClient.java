package src.producerconsumer;


import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainClient  {
    public static void main(String[] args) {
        int maxSize = 3;
        Queue<Object> shirts = new ConcurrentLinkedQueue<>();

        Lock lock = new ReentrantLock();
        
        Producer p1 = new Producer(shirts, maxSize, "P1", lock);
        Producer p2 = new Producer(shirts, maxSize, "P2", lock);
        Producer p3  = new Producer(shirts, maxSize, "P3", lock);

        Consumer c1 = new Consumer(shirts, maxSize, "C1", lock);
        Consumer c2 = new Consumer(shirts, maxSize, "C2", lock);
        Consumer c3 = new Consumer(shirts, maxSize, "C3", lock);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();


    }
}
