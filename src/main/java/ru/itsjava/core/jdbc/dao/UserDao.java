package ru.itsjava.core.jdbc.dao;

import ru.itsjava.core.jdbc.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findByName(String name);
}
