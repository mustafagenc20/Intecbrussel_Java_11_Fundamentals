package be.intecbrussel;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] words = {"A", "B", "C", "D", "E", "F", "G", "H", "j", "k"};

        /*
        for (String s : words) {
            System.out.println(s);
        }
         */

        Boolean[] booleans1 = {true, false}; // class -> reference type it works
        boolean[] booleans = {true, false}; //primitive type don't work >> DO NOT USE !!

        Stream.of(words);
        Arrays.stream(words);
/*
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
        LongStream.range(1, 10); // 1, 2, 3, 4, 5, 6, 7, 8, 9
        LongStream.rangeClosed(1, 10); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        DoubleStream.
 */

//        Stream.of(words).forEach(System.out::println);
//        Stream.of(words).forEach(string -> System.out.println(string));

        IntStream.range(0, 10).forEach(i -> System.out.println(i)); // prints >> 1, 2, 3, 4, 5, 6, 7, 8, 9

        int sum = IntStream.range(0, 10).sum();
        System.out.println(sum);

        long count = IntStream.range(0, 10).count();
        System.out.println(count);

        int[] array = IntStream.range(0, 10).toArray();

        System.out.println("=========");
        IntStream.range(0,100)
                .filter(i -> i % 2 == 0) // if true >> pass element, if false >> yeet element
                .filter(i -> i % 10 != 0)
                .forEach(i -> System.out.println(i));

//        System.out.println("=========");
//        Predicate<Integer> onlyEven = i -> ...

/*
        System.out.println("=========");
        int[] result = IntStream.range(0,100)
                .filter(i -> i % 2 == 0) // if true >> pass element, if false >> yeet element
                .filter(i -> i % 10 != 0)
                .filter(i -> i < 50)
                .filter(i -> i > 25) // AND operator uses
                .toArray();
        System.out.println(Arrays.toString(result));

 */


        System.out.println("=========");
        IntPredicate[] predicates = new IntPredicate[3];

        predicates[0] = i -> i % 2 == 0;
        predicates[1] = i -> i % 10 != 0;
        predicates[2] = i -> i < 50;

        IntStream stream = IntStream.range(0,100);

        for (IntPredicate p : predicates) stream = stream.filter(p);
//        stream = stream.filter(i -> i % 2 == 0);

        int[] result = stream.toArray();

        IntStream.range(0, 100)             // this code does do the same thing
                .filter(predicates[0])
                .filter(predicates[1])
                .filter(predicates[2])
                .toArray();

        System.out.println(Arrays.toString(result));


    }
}
