package be.intecbrussel.eventbus;

public interface Event {
    boolean isCategory(EventCategory eventCategory);
    Object getInformation();
    void setInformation(Object info);
}
