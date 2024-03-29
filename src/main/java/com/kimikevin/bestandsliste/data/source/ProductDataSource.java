package com.kimikevin.bestandsliste.data.source;

import com.kimikevin.bestandsliste.data.model.Product;
import com.kimikevin.bestandsliste.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class ProductDataSource {

    public static ObservableList<Object> products = FXCollections.observableArrayList();
    // database url
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:free";

    // database username
    public static final String USERNAME = "c##kevin";

    // database password
    public static final String PASSWORD = "";

    public static void save(final Product product) {
        String query = "INSERT INTO PRODUCT VALUES (?,?,?)";

        try {
            // Get a connection to the database
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            // SQL statement
            Statement statement = connection.createStatement();
            // Execute the SQL query
            ResultSet resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Product find(int id) {
        String query = "SELECT ID FROM PRODUCT";
        try {
            // Get a connection to the database
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            // SQL statement
            Statement statement = connection.createStatement();
            // Execute the SQL query
            ResultSet resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Product> findAll() {
        String query = "SELECT * FROM PRODUCT";
        try {
            // Get a connection to the database
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //SQL statement
            Statement statement = connection.createStatement();
            // Execute SQL query
            ResultSet resultSet = statement.executeQuery(query);

            // process the results
            while (resultSet.next()) {
                // create a product object
                Product product = new Product(resultSet.getString(1),resultSet.getDouble(2));
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
