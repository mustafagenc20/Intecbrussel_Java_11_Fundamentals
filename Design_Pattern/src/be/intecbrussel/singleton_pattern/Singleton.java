package be.intecbrussel.singleton_pattern;

public class Singleton {
    // Conditions;

    //

    // 1. 1 instance only...
        // final >> mag niet veranderen...
    // 2. 'Easy' access to said instance
        // wij >> geven de code het instance
        // wij >> zet constructor private
                        // ENCAPSULATION
    private static Singleton instance = new Singleton();
                // EAGER <> LAZY --> Yukaridaki kod yavas calisir.

    private Singleton() {
    }
    public Singleton getInstance(){
//        if (instance == null) instance = new Singleton(); // "private static Singleton instance burada "= new Singleton();"" kullandigimiz icin bu satira gerek kalmadi!
        return this.instance;
    }
}
