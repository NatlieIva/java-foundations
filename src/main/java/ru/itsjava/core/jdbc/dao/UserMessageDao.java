package ru.itsjava.core.jdbc.dao;

import ru.itsjava.core.jdbc.domain.User;
import ru.itsjava.core.jdbc.domain.UserMessage;

import java.util.List;

public interface UserMessageDao {
    public List<UserMessage> findAllByUser(User user);

}
