package src.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientMain {
    public static void main(String[] args) {
        // How to create streams
        Integer[] arr = {10, 20, 30, 40, 50};
        // one of way passing value to stream
        Stream<Integer> stream = Stream.of(arr);

        // another of way passing value to stream
        Stream<Integer> stream1 = Stream.of(10,20,30,40);

        // another of way passing value to stream
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        Stream<Integer> listStream2 = list.stream();

        // another of way passing value to stream
        Stream.Builder<Integer> sb = Stream.builder();
        sb.add(10);
        sb.add(20);
        sb.add(30);
        sb.add(40);
        Stream<Integer> stream2 = sb.build();
    }
}
