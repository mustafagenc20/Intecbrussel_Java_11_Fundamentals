package be.intecbrussel.exercise01;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private float weight;
    private float height;

    public Person(String firstName, String lastName, Gender gender, int age, float weight, float height){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", gender=" + gender +
                ", age=" + age + ", weight=" + weight + ", height=" + height + '}';
    }

    public enum Gender{
        Male, Female
    }
}