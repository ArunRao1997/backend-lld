package src.comparable;

import java.util.PriorityQueue;

public class ClientMain {
    public static void main(String[] args) {
//        PriorityQueue<Car> pq = new PriorityQueue<>(new CarComparator() );
//        PriorityQueue<Car> pq = new PriorityQueue<>(new CarSpeedComparator() );
        PriorityQueue<Car> pq = new PriorityQueue<>(Car.CAR_SPEED_COMP );
        pq.add(new Car(10,100));
        pq.add((new Car(20,200)));
        pq.add(new Car(30,300));

        while(!pq.isEmpty()){
            Car c = pq.poll();
            System.out.println(c.power + " " + c.speed);
        }
    }
}
