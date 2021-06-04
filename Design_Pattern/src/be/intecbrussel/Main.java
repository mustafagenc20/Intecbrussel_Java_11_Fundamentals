package be.intecbrussel;

import be.intecbrussel.eventbus.*;

public class Main {
    public static void main(String []args) {
        Event event = new ConcreteEvent(EventCategory.DEFCON_FIVE, "Defcon_Five event");
        EventBus bus = new EventBus();
        EventListener listener = new ConcreteEventListener();
        EventListener listener1 = new ConcreteEventListener();
        EventListener listener2 = new ConcreteEventListener();

        bus.addEventListener(listener);
        bus.addEventListener(listener1);
        bus.addEventListener(listener2);
//        bus.removeEventListener(listener2);

        bus.publishEvent(event);


    }
}
