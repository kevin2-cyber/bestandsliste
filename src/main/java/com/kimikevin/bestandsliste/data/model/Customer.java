package com.kimikevin.bestandsliste.data.model;

public class Customer {
    private int id;
    private int count = 0;

    public Customer(int id) {
        this.id = id;
    }

    public Customer() {
        id = count++;
    }

    public int getId() {
        return id;
    }
}
