package src.comparable;

import java.util.Comparator;

public class Car implements Comparable<Car>{
    int speed;
    int power;

    public Car(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    @Override
    public int compareTo(Car o) {
        return this.speed - o.speed;
    }

    static  final CarSpeedComp CAR_SPEED_COMP = new CarSpeedComp();
    static class CarSpeedComp implements Comparator<Car>{

        @Override
        public int compare(Car o1, Car o2) {
            return o1.speed - o2.speed;
        }
    }
}
