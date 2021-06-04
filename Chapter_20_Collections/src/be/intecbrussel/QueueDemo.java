package be.intecbrussel;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {


        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(1);

        System.out.println(integerQueue);

        System.out.println(integerQueue.remove());
        System.out.println(integerQueue);
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue);

        System.out.println(integerQueue.element());
        System.out.println(integerQueue);


        // ====== Deque ========
        Deque<Integer> doubleEnded = new LinkedList<>();
        doubleEnded.addFirst(6);
        System.out.println(doubleEnded);
        doubleEnded.addFirst(7);
        doubleEnded.addFirst(8);
        System.out.println(doubleEnded);

        doubleEnded.removeFirst();
        System.out.println(doubleEnded);


        // ==============

        List<Queue> queueList;
//        Queue[] queues;           // Ileri duzey
//        Set<Queue> queueSet;
//        Queue<Queue<String>> qt;


        PriorityQueue priorityQueue = new PriorityQueue();




    }
}
