package com.kimikevin.bestandsliste.util;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.EmptyStackException;
import java.util.Vector;

public class Stack implements Observable {
    @Override
    public void addListener(InvalidationListener listener) {

    }

    @Override
    public void removeListener(InvalidationListener listener) {

    }

//    public E push(E item) {
//        addElement(item);
//        return item;
//    }
//
//    public synchronized E pop() {
//        E  obj;
//        int len = size();
//        obj = peek();
//        removeElementAt(len - 1);
//        return obj;
//    }
//
//    public synchronized E peek() {
//        int len = size();
//
//        if (len == 0)
//            throw new EmptyStackException();
//        return elementAt(len - 1);
//    }
//
//    public boolean empty() {
//        return size() == 0;
//    }
//
//    public synchronized int search(Object o) {
//        int i = lastIndexOf(o);
//        if (i >= 0) {
//            return size() - i;
//        }
//        return -1;
//    }
}