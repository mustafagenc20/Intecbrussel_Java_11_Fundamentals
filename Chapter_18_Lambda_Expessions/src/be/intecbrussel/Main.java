package be.intecbrussel;

import be.intecbrussel.talker.ISpeaker;
import be.intecbrussel.talker.SpeakerImpl;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        String text = "42 is the answer to the ultimate question about life, the universe and everything!";

        // ================
//        ISpeaker speaker = new SpeakerImpl(); or
        // ================
//        ISpeaker speaker = new ISpeaker() {
//            @Override
//            public void say(String textToSpeak) {
//                System.out.println(textToSpeak);
//            }
//        }; // DON'T FORGET ";" THIS!!!
        // ===============
//        ISpeaker speaker =
        // public void say(String textToSpeak) // methode in interface is altijd public dus "public" niet nodig hier, "String" ook
                // ook "void say" niet nodig!

        // ==== ALTTAKI 2 ORNEKTE AYNIDIR =========
        ISpeaker speaker1 = (textToSpeak) -> System.out.println(textToSpeak); // LAMBDA EXPRESSION --- Yukaridaki kodun kisa hali..
        ISpeaker speaker2 = System.out::println;

//        String::length;
//        (s) -> s.length();
//
//        FoodMain::mainCooker;
//        (food) -> FoodMain.mainCooker(food);
//
//        speaker1::say;
//        (text) -> speaker1.say(text);


//        BigDecimal::new;
//        v -> new BigDecimal(v);

        // ===== AYNI ISLEMI GORURLER ==========
        IDecimalMaker maker1 = BigDecimal::new;
        IDecimalMaker maker2 = aNumber -> new BigDecimal(aNumber);


        speaker1.say(text);
    }
}
