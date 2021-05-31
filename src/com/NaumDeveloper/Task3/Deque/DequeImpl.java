package com.NaumDeveloper.Task3.deque;

public class DequeImpl<T> implements IMaster<T> {


    protected static final int HEAD_DEFAULT = 0;
    protected static final int TAIL_DEFAULT = -1;

    protected final T[] data;
    protected int size;

    protected int tail;
    protected int head;

    @SuppressWarnings("unchecked")
    public DequeImpl(int maxSize) {
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



    /*

    New:

    boolean insertRight(E value);
    E removeLeft();

    boolean insertLeft(E value);
    E removeRight();

     */



    @Override
    public boolean insertRight(T value) {

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

    @Override
    public T removeLeft() {

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
    public boolean insertLeft(T value) {
        if (isFull()) {
            return false;
        }
        if (head == HEAD_DEFAULT)
            head = data.length;

        data[--head] = value;
        size++;

        return true;
    }

    @Override
    public T removeRight() {
        if (isEmpty()) {
            return  null;
        }
        if (tail == TAIL_DEFAULT)
            tail = data.length - 1;

        size--;
        return data[tail--];
    }

}