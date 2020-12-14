package ru.itsjava.core.jdbc;

import ru.itsjava.core.jdbc.dao.UserDao;
import ru.itsjava.core.jdbc.dao.UserDaoJdbcImpl;
import ru.itsjava.core.jdbc.dao.UserMessageDao;
import ru.itsjava.core.jdbc.dao.UserMessageDaoJdbcImpl;
import ru.itsjava.core.jdbc.domain.User;

public class JdbcPractice {

//    private final static String DB_URL = "jdbc:MySql://localhost:3306/vk_schema?serverTimezone=UTC";
//    private final static String DB_NAME = "";
//    private final static String DB_PASSWORD = "";

    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_NAME, DB_PASSWORD);
//             Statement statement = connection.createStatement();
//        ) {
//            ResultSet resultSet = statement.executeQuery("SELECT name, age, email FROM users WHERE name = 'Ваня'");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name") + ":" + resultSet.getInt("age") + ":" +
//                        resultSet.getString("email"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        UserDao dao = new UserDaoJdbcImpl();
        System.out.println(dao.findByName("Ваня"));

        User userExample = new User("Кирилл", 30);

        UserMessageDao daoMessage = new UserMessageDaoJdbcImpl();
        System.out.println(daoMessage.findAllByUser(userExample));
    }
}
