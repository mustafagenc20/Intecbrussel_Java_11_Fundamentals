package be.intecbrussel.eventbus;

public class ConcreteEventListener implements EventListener{
    @Override
    public void onEvent(Event event){
//        if(event.isCategory(EventCategory.DEFCON_FIVE))
            System.out.println(event.getInformation().toString());
    }
}
