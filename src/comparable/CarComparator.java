package src.comparable;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.power > o2.power){
            return o1.speed - o2.speed;
        }else{
            return o1.power - o2.power;
        }
    }
}
