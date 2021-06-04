package be.intecbrussel.exercise01;

import java.util.*;

public class ListApp {
    public static void main(String[] args) {
        firstSolution();
        secondSolution();
    }

        public static void firstSolution(){
        List<Integer> numbers = new LinkedList<>();
        Scanner keyboard = new Scanner(System.in);
        boolean keepAsking = true;

        while(keepAsking) {
            try {
                System.out.print("Enter a number('-1' stops): ");
                int input = keyboard.nextInt();
                if(input == -1){
                    break;
                }
                numbers.add(input);
            } catch (InputMismatchException exception) {
                keepAsking = false;
            }
        }

        System.out.print("The list: ");
        printList(numbers); // of numbers.forEach(i -> sout(i));
        System.out.println();
        printSum(numbers);

        printAverage(numbers);
    }

    /*public static void printList(List<Integer> list){
        Iterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }*/

    public static void printList(List<Integer> list){
        list.forEach(number -> System.out.print(number + " "));
    }

    public static void printSum(List<Integer> list){
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The sum is " + sum);
    }

    public static void printAverage(List<Integer> list) {
        OptionalDouble average = list.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        if (average.isPresent()) {
            System.out.println("The average is " + average.getAsDouble());
        }
    }
    // ============================================================

    public static void secondSolution(){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input = 0;

        while (input >= 0){
            System.out.println("Give a number: (negative to stop)");
            input = keyboard.nextInt();
            if (input >= 0) numbers.add(input);
        }

//        for (Integer i : numbers) System.out.println(i);
        numbers.forEach(System.out::println);
    }
}
