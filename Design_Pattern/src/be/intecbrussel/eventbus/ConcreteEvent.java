package be.intecbrussel.eventbus;

public class ConcreteEvent implements Event{
    private EventCategory category;
    private Object message;
    public ConcreteEvent(EventCategory category, Object message) {
        this.category = category;
        this.message = message;
    }

    @Override
    public boolean isCategory(EventCategory category){
        return this.category == category;
    }
    @Override
    public Object getInformation(){
        return message;
    }
    @Override
    public void setInformation(Object info){
        this.message = info;
    }
}
