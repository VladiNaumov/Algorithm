package com.NaumDeveloper.Task3.Stack;



public class MyStack <T>implements IStack<T> {

    //Здесь в качественно основного хранилища елементов это масси
    private final T[]data;

    //отвечает за размер массива
    private int size;


    @SuppressWarnings("unchecked")
    public MyStack(int maxSize) {
        this.data = (T[]) new Object[maxSize];
    }


    //Добовление элемента
    @Override
    public void push(T value) {
        data[size++] = value;
    }

    //Извлечение (удаление) последнего элемента, так как это стек
    @Override
    public T pop() {
        T value = peek();
        data[--size] = null;
        return value;
    }

    //Чтение (последнего) элеметна, так как это стек
    @Override
    public T peek() {
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Данный метод сообщает полный стек или в нём есть место
    @Override
    public boolean isFull() {
        return size == data.length;
    }

    //Вывод на экран
    @Override
    public void display() {

        //(this)-Вызывает переопределённый метод toString
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
