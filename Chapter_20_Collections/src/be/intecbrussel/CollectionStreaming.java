package be.intecbrussel;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreaming {
    private static List<String> names = List.of("er erer", "lskdjf sefsdf", "kjshdg lsjedf", "lsjedf sdf");

    public static void main(String[] args) {

        /*
        List<Apple> result = names.stream()

                .filter(s -> s.contains("e"))
                .map(s -> s.new Apple(s))
                .collect(Collectors.toList());
//                .forEach(System.out::println);
        result.forEach(System.out::println);

         */

        // =====================
        List<String> result = names.stream()

                .filter(s -> s.contains("e"))
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
//                .forEach(System.out::println);
        result.forEach(System.out::println);

//        names.forEach(System.out::println); // Yukaridaki islemleren sonra print istesek orjinal halini verir
    }
}
