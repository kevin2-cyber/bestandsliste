package com.kimikevin.bestandsliste.repository;

import com.kimikevin.bestandsliste.data.model.Product;
import com.kimikevin.bestandsliste.util.List;

public class ProductRepository implements Repository<Product> {

    List<Product> products;
    @Override
    public void save(Product entity) {
        products.add(entity);
    }

    @Override
    public Product find(int id) {
        for (Product product: products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
