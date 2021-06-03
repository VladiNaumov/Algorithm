package com.NaumDeveloper.Task4.iterator;

public interface ListIterator<E> extends Iterable<E>{

    void reset();

    void insertBefore(E value);

    void insertAfter(E value);

}
