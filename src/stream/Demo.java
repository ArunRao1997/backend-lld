package src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        // Filter out even numbers
        List<Integer> list = Arrays.asList(10, 11, 20, 21, 30, 31, 40, 41);
        Stream<Integer> listStream = list.stream();
        System.out.println(listStream.filter(x -> x % 2 == 0).toList());

        List<Car> cars = Arrays.asList(
                new Car(100, 500, "BMW"),
                new Car(200, 600, "Mercedes"),
                new Car(160, 700, "Mustang"),
                new Car(180, 800, "Tesla"),
                new Car(220, 900, "Ferrari")
        );

        List<Integer> prices = cars.stream().map(c -> c.price).toList();
        System.out.println(prices);
    }
}
