package com.kimikevin.bestandsliste.data.model;

public class Customer {
    private int id;

    public Customer(int id) {
        this.id = id;
    }

    public Customer() {
        id = 0;
    }

    public int getId() {
        return id;
    }
}
