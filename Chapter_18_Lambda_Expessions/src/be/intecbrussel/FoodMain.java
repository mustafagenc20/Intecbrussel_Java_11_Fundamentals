package be.intecbrussel;

import be.intecbrussel.foodservice.CookedFood;
import be.intecbrussel.foodservice.FoodEater;
import be.intecbrussel.foodservice.ICooker;
import be.intecbrussel.foodservice.RawFood;

public class FoodMain {
    public static void main(String[] args) {
        FoodEater eater = new FoodEater();
//        CookedFood food = new CookedFood("Cooked Food");
        RawFood food = new RawFood("Raw egg");

/*        eater.eat(food, new ICooker(){
            @Override
            public CookerFood cook(RawFood food) {
                CookedFood cookedFood = new CookedFood("Cooked: " + food.getName());
                return cookedFood;
            }
        });
 */

        // ==== LAMBDA EXPRESSION =====
//        eater.eat(food, (rawFood) -> new CookedFood("Cooked: " + rawFood.getName()));
        eater.eat(food, (rawFood) -> FoodMain.mainCooker(rawFood)); // Method ile yaparsak!!
    }

    public static CookedFood mainCooker(RawFood rawFood){
        String newName = "Cooked: " + rawFood.getName();

        return new CookedFood(newName.toUpperCase());
    }
}
