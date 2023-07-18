package com.kimikevin.bestandsliste.data.queue;

import com.kimikevin.bestandsliste.data.model.Product;
import com.kimikevin.bestandsliste.util.List;
import com.kimikevin.bestandsliste.util.Queue;

public class QueueRepositoryImpl implements QueueRepository<Product> {

    private Queue<Product> products;


    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Queue<Product> getAllProducts() {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void save(Product entity) {

    }

    @Override
    public Product find(int id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
