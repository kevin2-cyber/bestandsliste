package com.kimikevin.bestandsliste.model.queue;

import com.kimikevin.bestandsliste.model.Product;
import com.kimikevin.bestandsliste.util.Queue;

public class QueueProductDaoImpl implements QueueProductDao {

    private Queue<Product> products;


    @Override
    public Product getProductById(int id) {
        for(Product product: products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Queue<Product> getAllProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct() {
        products.remove();
    }
}
