package ru.iroqquois.publisher;

import ru.iroqquois.Subscriber;
import ru.iroqquois.event.Event;
import ru.iroqquois.event.WarningEvent;

import java.util.List;

public class WarningPublisher implements Publisher<WarningEvent> {
    @Override
    public void publish(Event[] events) {

    }

//    private final List<Subscriber<WarningEvent>> subscribers;
//
//    public WarningPublisher(List<Subscriber<WarningEvent>> subscribers) {
//        this.subscribers = subscribers;
//    }
//
//    @Override
//    public void publish(WarningEvent... events) {
//
//    }
}
