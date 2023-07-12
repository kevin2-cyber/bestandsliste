package com.kimikevin.bestandsliste.util;

import java.util.ArrayList;

public class Stack<E> {

    public ArrayList<E> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(E element) {
        list.add(list.size(), element);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}