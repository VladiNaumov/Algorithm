package Task3.queue;

public class PriorityQueue<T extends Comparable<? super T>> implements IQueue<T> {

    private final T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public PriorityQueue(int maxSize) {
        this.data = (T[]) new Comparable[maxSize];
    }

    // O(N)
    @Override
    public boolean insert(T value) {
        if (isFull()) {
            return false;
        }

        int index;
        for (index = size - 1; index >= 0; index--) {
            if (value.compareTo(data[index]) > 0) {
                data[index + 1] = data[index];
            } else {
                break;
            }
        }

        data[index + 1] = value;
        size++;
        return true;
    }

    @Override
    public T remove() {
        return isEmpty() ? null : data[--size];
    }

    @Override
    public T peekFront() {
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

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public T peekTeil() {
        return null;
    }


}
