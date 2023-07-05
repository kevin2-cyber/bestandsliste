package com.kimikevin.bestandsliste.model.database;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection();
}
