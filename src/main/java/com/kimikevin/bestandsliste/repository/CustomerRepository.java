package com.kimikevin.bestandsliste.repository;

import com.kimikevin.bestandsliste.data.model.Customer;
import com.kimikevin.bestandsliste.util.List;

public class CustomerRepository implements Repository<Customer> {

    List<Customer> customers;

    @Override
    public void save(Customer entity) {
        customers.add(entity);
    }

    @Override
    public Customer find(int id) {
        for(Customer customer: customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
