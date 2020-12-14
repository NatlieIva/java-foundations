package ru.itsjava.core.jdbc.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserMessage {
    private final String author;
    private String message;

    @Override
    public String toString() {
        return "UserMessage{" +
                "author='" + author + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
