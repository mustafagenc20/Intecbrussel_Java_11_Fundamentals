package be.intecbrussel.foodservice;

public class CookedFood extends Food{
    private String name;
    public CookedFood(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
