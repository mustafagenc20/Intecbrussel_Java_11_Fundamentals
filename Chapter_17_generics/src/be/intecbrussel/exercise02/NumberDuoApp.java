package be.intecbrussel.exercise02;

public class NumberDuoApp {
    public static void main(String[] args) {
        NumberDuo<Integer> nd1 = new NumberDuo<>(3, 5);
        NumberDuo<Double> nd2 = new NumberDuo<>(3.2, 5.8);
        NumberDuo<Number> nd3 = new NumberDuo<>(3.2, 5);

        System.out.println(nd1.getSum());
        System.out.println(nd2.getSum());
        System.out.println(nd3.getSum());
    }


}
