package com.kimikevin.bestandsliste.model.queue;

import com.kimikevin.bestandsliste.model.Product;
import com.kimikevin.bestandsliste.util.Queue;

public interface QueueProductDao {
    Product getProductById(int id);
    Queue<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct();
}
