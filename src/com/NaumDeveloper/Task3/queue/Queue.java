package com.NaumDeveloper.Task3.queue;

//реалезация абстрактной структуры ОЧЕРЕДЬ


import java.util.Arrays;

public class Queue<T> implements IQueue<T>{

    //начало очереди
    private static final int HEAD_DEFAULT = 0;

    //конец очереди
    private static final int TAIL_DEFAULT = -1;

    private final T[] data;
    private int size;

    //метка конца очереди
    private int tail;

    //метка начала очереди
    private int head;

    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.data = (T[]) new Object[maxSize];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }
    // O(1)

    //Данный метод говорит можем ли мы добавить значения или нет.
    @Override
    public boolean insert(T value) {
        if (isFull()) {
            return false;
        }

        if (tail == data.length - 1) {
            tail = TAIL_DEFAULT;
        }

        data[++tail] = value;
        size++;

        return true;
    }

    // O(1)
    //удаление элемента из очереди (в очереди удаляется перый элемент)
    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }

        if (head == data.length) {
            head = HEAD_DEFAULT;
        }

        T value = data[head++];
        size--;

        return value;
    }

    //начало очереди
    @Override
    public T peekFront() {
        return data[head];
    }

    //метка конца очереди
    @Override
    public T peekTeil() {
        return data[tail];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "Queue{" + "data=" + Arrays.toString(data) + '}';
    }
}

