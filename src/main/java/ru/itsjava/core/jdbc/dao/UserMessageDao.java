package ru.itsjava.core.jdbc.dao;

import ru.itsjava.core.jdbc.domain.Message;
import ru.itsjava.core.jdbc.domain.User;

import java.util.List;

public interface UserMessageDao {
    public List<Message> findAllByUser(User user);

}
