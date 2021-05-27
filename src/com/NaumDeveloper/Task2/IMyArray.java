package com.NaumDeveloper.Task2;

public interface IMyArray<T> {
    void add(T value);

    T get(int index);

    boolean remove(T value);

    T remove(int index);

    int indexOf(T value);

    boolean contains(T value);

    int size();

    boolean isEmpty();

    void display();


    void sortBubble();
    void sortSelect();
    void sortInsert();
}
