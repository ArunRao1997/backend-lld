package src.synchronization;

public class Count {
    private int value;

    public synchronized void increment(int i){
        value += i;
    }

    public synchronized void decrement(int i){
        value -= i;
    }

    public int getValue() {
        return value;
    }

}
