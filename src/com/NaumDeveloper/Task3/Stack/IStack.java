package com.NaumDeveloper.Task3.Stack;

public interface IStack<T> {

    //Добовление элемента
    void push(T value);

    //Извлечение элемента с вершины, так как это стек
    T pop();

    //Чтение элеметна с вершины, так как это стек
    T peek();

    //Количества элементов
    int size();

    //
    boolean isEmpty();

    // Данный метод сообщает полный стек или в нём есть место
    boolean isFull();

    //Вывод на экран
    void display();
}
