package com.kimikevin.bestandsliste.model.database;

public class DatabaseManager {
    private ConnectionFactory connectionFactory;

    public DatabaseManager(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void doSomethingWithDatabase() {
        Connection connection = connectionFactory.createConnection();
        // Use the database connection for operations
        // ...
        connection.close();
    }
}
