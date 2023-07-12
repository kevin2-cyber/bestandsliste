package com.kimikevin.bestandsliste.model;

import com.kimikevin.bestandsliste.util.Stack;


public interface StackProductDao {
    Product getProductById(int id);
    Stack<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
}
