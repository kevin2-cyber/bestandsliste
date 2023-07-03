package com.kimikevin.bestandsliste.util;

import java.util.Collection;

public interface Queue<E> extends Collection<E> {
    boolean add(E e);
    boolean offer(E e);
    E remove();
    E poll();
    E element();
    E peek();
}
