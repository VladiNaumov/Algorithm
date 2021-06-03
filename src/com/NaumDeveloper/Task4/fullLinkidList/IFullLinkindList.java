package com.NaumDeveloper.Task4.fullLinkidList;

import com.TwoLinkinList.ITwoLinkedList;

public interface IFullLinkindList <E> {

    //Вставляем (добовляеи) элемент в начало списка
    void insertFirst(E value);

    //Удаление первого элемента из спика
    E removeFirst();

    //удалить элемент из списка (проверка наличие элементов в списке)
    boolean remove(E value);

    //отвечает за поиск елемента в списке
    boolean contains(E value);

    //размер списка
    int size();

    //проверка пустой ли список или нет
    boolean isEmpty();

    //Прочитать список и вывести его на экран
    void display();

    //получение первого элемента из списка
    E getFirst();


    //TwoSideLinkedList
    //Вставляем (добовляеи) элемент в конец списка
    void insertLast(E value);


    E getLast();

    //deleting элемента в конеце списка
    E removeLast();

    // класс отвечающий за узел связывающего списка
    class Node<E> {
        //хранить данный
        E item;

        // хранит ссылку на следующий элемент
        Node<E> next;

        // хранит ссылку на предыдущий элемент
        Node<E> previous;

        //конструктор
        public Node(E item, Node<E> next, Node<E> previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }
}
