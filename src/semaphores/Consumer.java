package src.semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{

    Queue<Object> shirts;

    int maxSize;

    String name;
    Semaphore p;
    Semaphore c;

    Consumer(Queue<Object> shirts, int maxSize, String name,Semaphore p, Semaphore c){
        this.shirts = shirts;
        this.maxSize = maxSize;
        this.name = name;
        this.p = p;
        this.c = c;
    }
    @Override
    public void run() {
        while (true) {
            try {
                c.acquire();
                if (shirts.size() > 0) {
                    System.out.println(name + " is removing the object, size = " + shirts.size());
                    shirts.remove();
                }
                c.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

