package be.intecbrussel.exercise01;

public class DuoApp {

    public static void main(String[] args) {
        Duo<String> sd = new Duo<String>("Hello", "World");
        Duo<Integer> id = new Duo<Integer>(7, 5);

        String s1 = sd.getFirst();
        String s2 = sd.getSecond();

        Integer i1 = id.getFirst();
        Integer i2 = id.getSecond();

        System.out.println(s1 + " " + s2);
        System.out.println(i1 + i2);
    }
}
