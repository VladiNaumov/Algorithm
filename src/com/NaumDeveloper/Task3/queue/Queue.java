package com.NaumDeveloper.Task3.queue;

public class Queue<T> implements IQueue<T>{

    private static final int HEAD_DEFAULT = 0;
    private static final int TAIL_DEFAULT = -1;

    private final T[] data;
    private int size;

    private int tail;
    private int head;

    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.data = (T[]) new Object[maxSize];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }
    // O(1)
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

    @Override
    public T peekFront() {
        return data[head];
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
}

