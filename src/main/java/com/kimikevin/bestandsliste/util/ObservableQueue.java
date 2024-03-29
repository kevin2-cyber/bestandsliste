package com.kimikevin.bestandsliste.util;

import javafx.collections.ObservableListBase;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ObservableQueue<E> extends ObservableListBase<E> implements Queue<E> {

    private final Queue<E> queue;

    public ObservableQueue(Queue<E> queue) {
        this.queue = queue;
    }

    public ObservableQueue() {
        this(new LinkedList<>());
    }

    @Override
    public boolean offer(E e) {
        beginChange();
        boolean result = queue.offer(e);
        if (result){
            nextAdd(queue.size() - 1, queue.size());
        }
        endChange();
        return result;
    }

    @Override
    public boolean add(E e) {
        beginChange();
        try {
            queue.add(e);
            nextAdd(queue.size() -1, queue.size());
            return true;
        } finally {
            endChange();
        }
    }

    @Override
    public E remove() {
        beginChange();
        try {
            E e = queue.remove();
            nextRemove(0,e);
            return e;
        } finally {
            endChange();
        }
    }

    @Override
    public E poll() {
        beginChange();
        E e = queue.poll();
        if (e != null) {
            nextRemove(0,e);
        }
        endChange();
        return e;
    }

    @Override
    public E element() {
        return queue.element();
    }

    @Override
    public E peek() {
        return queue.peek();
    }

    @Override
    public E get(int index) {
        Iterator<E> iterator = queue.iterator();
        for (int i = 0; i < index; i++) {
            iterator.next();
        }
        return iterator().next();
    }

    @Override
    public int size() {
        return queue.size();
    }
}
