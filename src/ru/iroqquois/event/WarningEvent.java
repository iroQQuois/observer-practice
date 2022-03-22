package ru.iroqquois.event;

import ru.iroqquois.entity.Warning;

public class WarningEvent extends Event<Warning> {
    public WarningEvent(Warning body) {
        super(body);
    }
}
