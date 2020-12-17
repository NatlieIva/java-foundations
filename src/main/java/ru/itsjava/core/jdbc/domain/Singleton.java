package ru.itsjava.core.jdbc.domain;

import ru.itsjava.core.jdbc.util.Settings;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum Singleton {
    CONNECTOR;

    public Connection getConnection() throws IOException, SQLException {
        Connection connection = DriverManager.getConnection(Settings.getValue("DB_URL"),
                Settings.getValue("DB_NAME"), Settings.getValue("DB_PASSWORD"));
        return connection;
    }
}
