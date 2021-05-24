package be.intecbrussel.exercise01;

public class Duo<E> {
    private E first;
    private E second;

    public Duo (E first, E second){
        this.first = first;
        this.second = second;
    }
    public E getFirst(){
        return this.first;
    }
    public void setFirst(E first){
        this.first = first;
    }
    public E getSecond() {
        return this.second;
    }
    public void setSecond(E second){
        this.second = second;
    }
    public void swap(){
        E temporary = first;
        first = second;
        second = temporary;
    }
}
