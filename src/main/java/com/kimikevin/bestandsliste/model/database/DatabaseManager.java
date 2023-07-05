package com.kimikevin.bestandsliste.model.database;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseManager {
    private ConnectionFactory connectionFactory;

    public DatabaseManager(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void doSomethingWithDatabase() {
        try {
            Connection connection = connectionFactory.createConnection();
            // Use the database connection for operations
            // ...
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
}
