package src.comparable;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.speed*3 - o2.speed ;
    }
}
