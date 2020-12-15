package ru.itsjava.core.jdbc.dao;

import ru.itsjava.core.jdbc.domain.Message;
import ru.itsjava.core.jdbc.domain.Settings;
import ru.itsjava.core.jdbc.domain.User;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UserMessageDaoJdbcImpl implements UserMessageDao {

    @Override
    public List<Message> findAllByUser(User user) {
        List<Message> foundMessage = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(Settings.getValue("DB_URL"),
                Settings.getValue("DB_NAME"), Settings.getValue("DB_PASSWORD"))) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT users.name, mess.message FROM messages mess, users users WHERE mess.USER_ID = users.ID and users.name = ? and users.age = ?");
            ) {
                preparedStatement.setString(1, user.getName());
                preparedStatement.setInt(2, user.getAge());
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    foundMessage.add(new Message(resultSet.getString("name"),
                            resultSet.getString("message"),
                            user));
                }
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        if (foundMessage.isEmpty()) {
            throw new NoSuchElementException();
        }
        return foundMessage;
    }
}
