package org.example;

public interface ITree<E extends Comparable<? super E>> {

    // перечесления как мы будем обходить дерево
    enum TraverseMode {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER,
    }

    //Метод отвечающий за добовление элемента (удалось вставить true) нет то возвращаем false
    boolean add(E value);

    //поиск элементов
    boolean contains(E value);

    //удаление элементов
    boolean remove(E value);

    //проверка на пустоту
    boolean isEmpty();

    //количество элементов
    int size();

    //вывод на экран
    void display();

    //обход элементов по дереву (передаём сюда enum TraverseMode в качестве параметра )
     void traverse(TraverseMode mode);

}
