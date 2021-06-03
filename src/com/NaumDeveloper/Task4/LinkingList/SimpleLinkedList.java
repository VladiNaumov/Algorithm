package com.NaumDeveloper.Task4.LinkingList;

import java.util.Iterator;

//обычный (простой связанный список) -> LinkingList

public class SimpleLinkedList<E> implements ILinkedList<E> {

    //данное поле считает количества элементов в нашем списке
    protected int size;

    //Это класс описывающий первый элемент связывающего списка
    protected Node<E> firstElement;

    @Override
    public void insertFirst(E value) {

        Node <E> node =  new Node<>(value, firstElement);
        firstElement = node;
        size++;

        /*

       // Правельное написание без избуточности кода!
        firstElement = new Node<>(value, firstElement);
        size++;

         */
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Node<E> removedNode = firstElement;
        firstElement = removedNode.next;
        removedNode.next = null;

        size--;
        return removedNode.item;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = firstElement;
        Node<E> previous = null;
        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        } else if (current == firstElement) {
            removeFirst();
            return true;
        } else {
            previous.next = current.next;
        }

        current.next = null;
        size--;
        return true;
    }

    @Override
    public boolean contains(E value) {
        Node<E> current = firstElement;
        while (current != null) {
            if (current.item.equals(value)) {
                return true;
            }
            current = current.next;
        }

        return false;
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
    public E getFirst() {
        return getValue(firstElement);
    }

    protected E getValue(Node<E> node) {
        return node != null ? node.item : null;
    }


    @Override
    public void display() {
        System.out.println("----------");

        // Эта запись равна System.out.println(toString());
        System.out.println(this);

        System.out.println("----------");
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = firstElement;
        while (current != null) {
            sb.append(current.item);
            if (current.next != null) {
                sb.append(" -> ");
            }

            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }

}
