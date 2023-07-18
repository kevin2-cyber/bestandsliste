package com.kimikevin.bestandsliste.data.source;

import com.kimikevin.bestandsliste.data.model.Product;
import com.kimikevin.bestandsliste.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDataSource {
    // database url
    public static final String url = "jdbc:oracle:thin:@localhost:1521:free";

    // database username
    public static final String username = "c##kevin";

    // database password
    public static final String password = "";

    public static void save(final Product product) {
        String query = "INSERT INTO PRODUCT VALUES (?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement statement = connection.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Product find(int id) {
        String query = "";
        return new Product("Kofi", 20);
    }

    public static List<Product> findAll() {
        return null;
    }
}
