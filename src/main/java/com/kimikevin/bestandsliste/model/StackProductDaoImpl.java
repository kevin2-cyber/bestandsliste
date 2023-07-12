package com.kimikevin.bestandsliste.model;

import com.kimikevin.bestandsliste.util.Stack;

public class StackProductDaoImpl implements StackProductDao {
    private Stack<Product> products;

    public StackProductDaoImpl() {
        products = new Stack<>();
    }
    @Override
    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Stack<Product> getAllProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.push(product);
    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                break;
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        products.pop();
    }
}
