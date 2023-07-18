package com.kimikevin.bestandsliste.data.queue;

import com.kimikevin.bestandsliste.data.model.Product;
import com.kimikevin.bestandsliste.repository.Repository;
import com.kimikevin.bestandsliste.util.Queue;

public interface QueueRepository<T> extends Repository<T> {
    Product getProductById(int id);
    Queue<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct();
}
