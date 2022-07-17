package Task8;

import java.util.Iterator;
import java.util.LinkedList;

public class HomeWorkHashTable<K, V> implements HashTable<K, V> {

    private final LinkedList<Item<K, V>>[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public HomeWorkHashTable(int initialCapacity) {
        data = new LinkedList[initialCapacity];
    }

    private int hashFunc(K key) {
        return key.hashCode() % data.length;
    }

    @Override
    public boolean put(K key, V value) {
        int index = hashFunc(key);
        if (data[index] == null) {
            data[index] = new LinkedList<>();
        }
        for (Item<K, V> item : data[index]) {
            if (item.getKey().equals(key)) {
                item.setValue(value);
                return true;
            }
        }
        data[index].addLast(new Item<>(key, value));
        size++;
        return true;
    }

    @Override
    public V get(K key) {
        int index = hashFunc(key);
        for (Item<K, V> item : data[index]) {
            if (item.getKey().equals(key)) {
                return item.getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = hashFunc(key);
        if (data[index] != null) {
            Iterator<Item<K, V>> iterator = data[index].iterator();
            while (iterator.hasNext()) {
                Item<K, V> item = iterator.next();
                if (item.getKey().equals(key)) {
                    iterator.remove();
                    size--;
                    return item.getValue();
                }
            }
        }
        return null;
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
        System.out.println("----------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d = [%s]%n", i, data[i]);
        }
        System.out.println("----------");
    }

    interface Entry<K, V> {

        K getKey();

        V getValue();

        void setValue(V value);
    }

    static class Item<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

}
