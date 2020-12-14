package ru.itsjava.core.jdbc;

import ru.itsjava.core.jdbc.dao.UserDao;
import ru.itsjava.core.jdbc.dao.UserDaoJdbcImpl;
import ru.itsjava.core.jdbc.dao.UserMessageDao;
import ru.itsjava.core.jdbc.dao.UserMessageDaoJdbcImpl;
import ru.itsjava.core.jdbc.domain.User;

public class JdbcPractice {

    public static void main(String[] args) {

        UserDao dao = new UserDaoJdbcImpl();
        System.out.println(dao.findByName("Ваня"));

        User userExample = new User("Кирилл", 30);

        UserMessageDao daoMessage = new UserMessageDaoJdbcImpl();
        System.out.println(daoMessage.findAllByUser(userExample));
    }
}
