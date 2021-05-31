package com.NaumDeveloper.Task3.deque;

public interface IMaster<T> {

    boolean insert(T value);

    T remove();

    T peekFront();

    int size();

    boolean isEmpty();

    boolean isFull();

    boolean insertLeft(T value);

    boolean insertRight(T value);

    T removeLeft();

    T removeRight();
}
