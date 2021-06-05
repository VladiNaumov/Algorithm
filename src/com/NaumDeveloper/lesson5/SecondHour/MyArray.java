package com.NaumDeveloper.lesson5.SecondHour;

import java.util.Arrays;


public class MyArray<T extends Comparable<? super T>> implements IMyArray<T>{
    private static final int DEFAULT_CAPACITY = 8;

    protected T[] data;
    protected int size;

    @SuppressWarnings("unchecked")
    public MyArray(int initialCapacity) {
        this.data = (T[]) new Comparable[initialCapacity];
    }

    public MyArray() {
        this(DEFAULT_CAPACITY);
    }


    @Override
    public void add(T value) {
        checkAndGrow();
        data[size++] = value;
    }

    protected void checkAndGrow() {
        if (data.length == size) {
            data = Arrays.copyOf(data, calculateNewLength());
        }
    }

    private int calculateNewLength() {
        return size == 0 ? 1 : size * 2;
    }


    @Override
    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            String errorMsg = String.format("Incorrect 'index': %d; max value is %d",
                    index, size - 1);
            throw new IndexOutOfBoundsException(errorMsg);
        }
    }

    @Override
    public boolean remove(T value) {
        int index = indexOf(value);
        return index != -1 && remove(index) != null;
    }


    @Override
    public T remove(int index) {
        checkIndex(index);

        T removedValue = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);

        data[--size] = null;
        return removedValue;
    }


    @Override
    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) != -1;
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
    public void display() {
        System.out.println(this);
    }

    // O(n^2) - compare
    // O(n^2) - exchange
    @Override
    public void sortBubble() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int indexA, int indexB) {
        T temp = data[indexA];
        data[indexA] = data[indexB];
        data[indexB] = temp;
    }


    @Override
    public void sortSelect() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
        }
    }


    @Override
    public void sortInsert() {
        for (int i = 1; i < size; i++) {
            T temp = data[i];
            int in = i;
            while (in > 0 && data[in - 1].compareTo(temp) >= 0) {
                data[in] = data[in - 1];
                in--;
            }
            data[in] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size -1; i++) {
            sb.append(data[i]);
            sb.append(", ");
        }
        if (size > 0) {
            sb.append(data[size - 1]);
        }

        sb.append("]");
        return sb.toString();
    }
}
