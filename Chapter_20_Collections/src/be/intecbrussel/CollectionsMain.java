package be.intecbrussel;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {
//        setExample();
        treeSetExample();

        // 1. List<E>
        // 2. Set<E>
        // 3. Queue<E>
        // 4. Map<E, F>

        // Ordered == Volgerde
        // Ordered != Sorted

        // ========== 1. List<E> ========

//        List<String> list = new ArrayList<>();
//        list.add("A"); // index 0
//        list.add("B"); // index 1
//        list.add("C");
//        list.add("D");
//        list.add("D");
//        list.add("B");
//        list.add("A");
//        list.add("A");
//        list.add("A");
//        list.add("A");
//        list.remove("D");
//        list.removeAll(List.of("D"));
//        list.removeIf(s -> s.equals("A")); // To remove all "A"
//        System.out.println(list.get(1)); // list[1]

//        for(String s : list){
//            System.out.println(s);
//        }
//        list.forEach(System.out::println);

        System.out.println("===================================");

//        List<Integer> linked = new ArrayList<>();  // Polymorphism is always better(List = Interface) / instead -> "ArrayList<Integer> linked = new ArrayList<>();"
                                                   // flexibility de methoden kan je hergebruiken. Ex: List<Integer> linked = new LinkedList<>();

        // ====== Factory Methods ==========
//        List unmodifiedList = List.of("A", "B", "C", "D"); // IDK / IDC >> I dont know / I dont care
////        unmodifiedList.add("D"); // not possible to add or remove
//        unmodifiedList.forEach(System.out::println);


        System.out.println("===================================");

    }

    // =============== 2. HashSet<E> / NO DUPLICATE!!! prints only one times =================
    public static void setExample(){
        Set<String> strings = new HashSet<>(); // unordered and unsorted

        String a = "World";
        String b = new String("World"); // to create a new String
        System.out.println(a == b);

        strings.add("Hello");
        strings.add("World");
        strings.add("World");
        strings.addAll(List.of("A", "B", "C"));
        strings.addAll(List.of("A", "B", "C"));
        strings.addAll(List.of("A", "B", "C"));
        strings.add("D"); // TOEVAL
        strings.add(null);
        strings.add(null);

        strings.forEach(s -> System.out.println(s)); // NO DUPLICATE!!! prints only one times

        // ===== HASHCODE ============
        // If (hashcode are equal) then equals >> true
        // if (hashcode are not equal) then equals >> true or false
    }


    // ========= ALWAYS PROGRAM AGAINST AN INTERFACE
    // ========= TREESET ========
    public static void treeSetExample(){
        NavigableSet<String> strings = new TreeSet<>(); // ordered and sorted
//        Collection<String> strings = new ArrayList<>(); // More public s not preferably
//        Set<String> strings = new TreeSet<>(); // * // Unique // No duplicate //ordered >>> Most used
//        List<String> strings = new TreeSet<>(); // *
//        Map<String> strings = new TreeSet<>(); // *

        // ======= Polymorphism / Interface exp. ======
        List<String> test = new LinkedList<>();
        Queue<String> test2 = new LinkedList<>();
        Collection<String> test3 = new LinkedList<>();
        LinkedList<String> test4 = new LinkedList<>(); // Bu sekilde yazilir ise donusturmek zor olur. Butun kod tekrar gozden gecirilmeli!


        strings.add("Hello");
        strings.add("World");
        strings.add("World");
        strings.addAll(List.of("A", "B", "C"));
        strings.addAll(List.of("A", "B", "C"));
        strings.addAll(List.of("A", "B", "C"));
        strings.add("D"); // TOEVAL

        strings.forEach(s -> System.out.println(s));
//        System.out.println(strings.poolFirst());

    }

}
