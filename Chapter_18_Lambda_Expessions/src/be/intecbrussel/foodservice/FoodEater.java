package be.intecbrussel.foodservice;

public class FoodEater {
    public void eat(CookedFood food){
        System.out.println("Eating: " + food.getName());
    }
    public void eat(RawFood food){
        System.out.println("Can't eat raw food!!");
    }
    public void eat (RawFood rawFood, ICooker cooker){
        CookedFood cookedFood = cooker.cook(rawFood);
        this.eat(cookedFood);
    }
}
