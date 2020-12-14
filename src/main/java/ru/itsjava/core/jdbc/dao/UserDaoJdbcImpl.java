package ru.itsjava.core.jdbc.dao;

import ru.itsjava.core.jdbc.domain.Settings;
import ru.itsjava.core.jdbc.domain.User;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UserDaoJdbcImpl implements UserDao {

    @Override
    public List<User> findByName(String name) {
        List<User> foundUser = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(Settings.getValue("DB_URL"),
                Settings.getValue("DB_NAME"), Settings.getValue("DB_PASSWORD"))) {
            try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT name, age FROM users WHERE name = ?")) {
                preparedStatement.setString(1, name);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    foundUser.add(new User(resultSet.getString("name"), resultSet.getInt("age")));
                }
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        if (foundUser.isEmpty()) {
            throw new NoSuchElementException();
        }
        return foundUser;
    }
}
