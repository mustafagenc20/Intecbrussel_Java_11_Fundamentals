package be.intecbrussel.eventbus;

import java.util.Arrays;

public class EventBus {
    private int counter = 0;
    private EventListener[] eventListeners = new EventListener[10];
    // >> add/remove Listeners

    public void addEventListener(EventListener listener) {
        this.eventListeners[counter++] = listener;
    }

    public void removeEventListener(EventListener listener) {
        // remove listener from array
        for (int i = 0; i < eventListeners.length; i++) {
            if (eventListeners[i] == listener) eventListeners[i] = null;
        }
    }

    // 1. Receive events >> 2. Send Events
    public void publishEvent(Event event) {
        for (EventListener eventListener : eventListeners) {
            if (eventListener != null) eventListener.onEvent(event);
        }
    }
    // >> Which Listener is interested in what
}
