package ru.iroqquois;

import ru.iroqquois.event.Event;

public interface Subscriber<T extends Event<?>> {
    void acceptEvent(T event);
}
