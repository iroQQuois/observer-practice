package ru.iroqquois.publisher;

import ru.iroqquois.event.Event;

public interface Publisher<T extends Event<?>>{
    void publish(T ... events);
}
