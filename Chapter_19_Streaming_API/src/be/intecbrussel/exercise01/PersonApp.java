package be.intecbrussel.exercise01;

import java.util.stream.Stream;

public class PersonApp {
    public static void main(String[] args) {
        Person[] people = {new Person("Mustafa","Genc", Person.Gender.Male, 38,100,183),
                new Person("Tom", "Newman", Person.Gender.Male, 34, 70, 169),
                new Person("Alex", "Chase", Person.Gender.Female, 25, 60, 170)
        };
        Stream.of(people).forEach(System.out::println);
    }
}

