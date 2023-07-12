package com.kimikevin.bestandsliste.model;

import com.kimikevin.bestandsliste.util.Stack;

public class ProductDaoImpl implements ProductDao{
    private Stack<Product> products;

    public ProductDaoImpl() {
        products = new Stack<>();
    }
    @Override
    public Product getProductById(int id) {
        for (int i = 0; i < products.list.size(); i++) {
            if (products.list.get(i).getId() == id) {
                return products.list.get(i);
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
        for (int i = 0; i < products.list.size(); i++) {
            if (products.list.get(i).getId() == product.getId()) {
                products.list.set(i, product);
                break;
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        products.pop();
    }
}
