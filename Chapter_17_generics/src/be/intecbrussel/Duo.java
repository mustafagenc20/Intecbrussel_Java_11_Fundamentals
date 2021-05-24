package be.intecbrussel;

public class Duo {
    private Object first;
    private Object second;

    public Duo (Object first, Object second){
        this.first = first;
        this.second = second;
    }
    public Object getFirst(){
        return this.first;
    }
    public void setFirst(Object first){
        this.first = first;
    }
    public Object getSecond() {
        return this.second;
    }
    public void setSecond(Object second){
        this.second = second;
    }
    public void swap(){
        Object temporary = first;
        first = second;
        second = temporary;
    }
}
