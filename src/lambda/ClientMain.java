package src.lambda;


import java.util.PriorityQueue;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ClientMain {
    public static void main(String[] args) {
       Consumer<Integer> consumer = (x) ->{
            System.out.println(x);
        };
       consumer.accept(1);

        Predicate<Integer> predicate = (x) ->{
            return x > 0;
        };
        System.out.println(predicate.test(10));

        // Way1 of writing lambda
        Function<Integer, Integer> function = (x) ->{
            return x * 10;
        };
        System.out.println(function.apply(10));
        // Way2 of writing lambda
        Function<Integer, Integer> function1 = (x) -> x * 10;
        System.out.println(function1.apply(10));

        BiFunction<Integer, String, Boolean> booleanBiFunction = (x,y) -> x == y.length();
        System.out.println(booleanBiFunction.apply(2,"AB"));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> b-a);
//        System.out.println(priorityQueue.add(1));
    }
}
