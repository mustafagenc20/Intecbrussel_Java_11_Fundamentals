package be.intecbrussel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> englishFrenchDictionary = new HashMap<>();
        englishFrenchDictionary.put("Monday", "lundi");

        System.out.println(englishFrenchDictionary.get("Monday"));

//        Map<Apple, String> appleMap = new HashMap<>();
//        appleMap.put()

        Map<String, Apple> appleMap = new HashMap<>(); // Key needs to be unique! Try key: a and a / a and b
        appleMap.put("a", new Apple("Pickle"));
        appleMap.put("b", new Apple("Rick"));
        appleMap.put("c", new Apple("Rick"));
        appleMap.put("d", new Apple("Rick"));

        Set<String> keys = appleMap.keySet();
        System.out.println(keys);
        System.out.println(appleMap.size());


        // Array >> key => index
        // array[index] >>>>> map.get(key)
    }
}
