package ru.iroqquois.event;

import java.util.Optional;

public class Event <T> {
    protected Optional<T> body;

    public Event(T body) {
        this.body = (body != null) ? Optional.of(body) : Optional.empty();
    }
}
