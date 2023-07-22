package com.kimikevin.bestandsliste.repository;

import com.kimikevin.bestandsliste.util.List;

public interface Repository<T> {
    void save(T entity);
    T find(int id);
    List<T> findAll();
}
