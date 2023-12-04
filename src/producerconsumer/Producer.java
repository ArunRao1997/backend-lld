package src.producerconsumer;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{

    Queue<Object> shirts;

    int maxSize;

    String name;

    Lock lock;
    Producer(Queue<Object> shirts, int maxSize, String name,Lock lock){
        this.shirts = shirts;
        this.maxSize = maxSize;
        this.name = name;
        this.lock = lock;
    }
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (shirts.size() < maxSize) {
                System.out.println(name + " is adding the object, size = " + shirts.size());
                shirts.add(new Object());
            }
            lock.unlock();
        }
    }
}
