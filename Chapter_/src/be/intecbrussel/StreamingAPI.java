package be.intecbrussel;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamingAPI {
    public static void main(String[] args) {
        String[] words = {"F", "G", "H", "j", "k","A", "B", "C", "D", "E"};

        /*
        int[] result = IntStream.range(0, 100)
                .limit(10)
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 10 != 0)
                .filter(i -> i < 50)
                // .limit(10)  // if we place this code to up, then the result will be change!
                .toArray();
        System.out.println(Arrays.toString(result));

         */

        /*
        for (String w : words){

            w = w.toLowerCase() + "red";
            w = w.toUpperCase();
            System.out.println(w);
        }

        Stream.of(words)
                .map(w -> w.toLowerCase() + "red")
                .map(w -> w.toUpperCase())
                .sorted()
                .forEach(w -> System.out.println(w));

         */

        Stream.of(words)
                .map(w -> new Apple(w))
                .sorted((a1, a2) -> a1.getName().compareTo((a2.getName())))
                .forEach(apple -> System.out.println(apple));

    }

}
