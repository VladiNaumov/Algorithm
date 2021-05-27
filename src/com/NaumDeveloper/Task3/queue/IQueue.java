package com.NaumDeveloper.Task3.queue;

public interface IQueue <T> {

    boolean insert(T value);

    T remove();

    //Чение элемента
    T peekFront();

    int size();

    boolean isEmpty();

    boolean isFull();
}
