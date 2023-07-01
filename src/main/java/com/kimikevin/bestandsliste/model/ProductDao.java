package com.kimikevin.bestandsliste.model;

import java.util.List;

public interface ProductDao {
    Product getProductById(int id);
    List<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
}
