package be.intecbrussel.exercise02;

import java.util.Collection;
import java.util.HashSet;
import java.util.OptionalDouble;
import java.util.Scanner;

public class HashSetApp {
    public static void main(String[] args) {

        Collection<Integer> list = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number('-1' stops): ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        System.out.println("The list: ");
        printList(list); // No duplication is allowed
        System.out.println();
        printSum(list);
        printAverage(list);
    }

    /*
        public static void printList(List<Integer> list){
        Iterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        }
    */

    public static void printList(Collection<Integer> list){
        list.forEach(number -> System.out.println(number + " "));
    }

    public static void printSum(Collection<Integer> list){
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The sum is " + sum);
    }

    public static void printAverage(Collection<Integer> list){
        OptionalDouble average = list.stream()
                .mapToDouble(number -> number)
                .average();
        if(average.isPresent()){
            System.out.println("The average is " + average);
        }
    }
}
