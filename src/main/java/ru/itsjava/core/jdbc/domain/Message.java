package ru.itsjava.core.jdbc.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Message {
    private String message;
    private final User userFrom;

    @Override
    public String toString() {
        return "UserMessage{" +
                "user='" + userFrom.getName() + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
