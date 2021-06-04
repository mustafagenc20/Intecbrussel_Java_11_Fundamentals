package be.intecbrussel.exercice04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> userInputSet = askSet();
        Set<Integer> lottoSet = createSet();

        System.out.println(userInputSet);
        // ====== Prints =========
//        lottoSet.forEach(System.out::println);                    // 1. way
//        System.out.println(Arrays.toString(lottoSet.toArray()));  // 2. way
        System.out.println(lottoSet);                               // 3. way



        userInputSet.retainAll(lottoSet);           // Doorsnede - Intersection
        System.out.println("Set after retainAll");

        System.out.println(userInputSet);
    }

    private static Set<Integer> askSet(){
        Set<Integer> inputSet = new HashSet<>();

        do{
            System.out.println("Give a number between 1-45");
            int i = askIntInput();
            if (i <=5 && i >= 1){
                inputSet.add(i);
            }
        }
        while (inputSet.size() < 6);
        return inputSet;
    }

    private static int askIntInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static Set<Integer> createSet(){
        Random random = new Random();
        Set<Integer> lottoNumbers = new HashSet<>();

        while (lottoNumbers.size() < 6){
            lottoNumbers.add(random.nextInt(45) + 1);
        }
        return  lottoNumbers;
    }

    public static void retainAllDemo(){

    }
}
