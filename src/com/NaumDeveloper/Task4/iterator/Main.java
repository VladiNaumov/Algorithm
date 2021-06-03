package com.NaumDeveloper.Task4.iterator;

import com.LinkingList.ILinkedList;
import com.LinkingList.SimpleLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static void main(String[] args) {

    }

    private static void testForEach() {
        /*
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
        }

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
//
//        System.out.println("----");
//
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

         */
//
        ILinkedList<Integer> ILinkedList = new SimpleLinkedList<>();
        ILinkedList.insertFirst(1);
        ILinkedList.insertFirst(2);
        ILinkedList.insertFirst(3);
        ILinkedList.insertFirst(4);

        ILinkedList.display();

        // т.к мы не реалезовали extends Iterable<E>
        /*
        for(Integer value: ILinkedList) {
            System.out.println(value);
        }

         */
    }

    public static void hz(){

        ILinkedList<Integer> list = new SimpleLinkedList<>();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

     /*
        displayAll(list);

        System.out.println("-----------");

        ListIterator<Integer> iterator = (ListIterator<Integer>) list.iterator();
        iterator.reset();//1! 2 3 4
        iterator.insertAfter(11);//1 11! 2 3 4
        iterator.next();//1 11 2! 3 4
        iterator.remove();//1 11 3! 4
        iterator.insertBefore(0);// 1 11 0! 3 4

        displayAll(list);
        System.out.println("-----------");

        iterator = (ListIterator<Integer>) list.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
            displayAll(list);
            System.out.println("-----------");
        }

        List<Integer> arrayData = new ArrayList<>();
        arrayData.add(1);
        arrayData.add(2);
        arrayData.add(3);
        arrayData.add(4);

        for (Integer datum : arrayData) {
            System.out.println(datum);
            arrayData.remove(datum);
        }

    }

    private static void testForEach() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
        }

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
//
//        System.out.println("----");
//
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
//
        ILinkedList<Integer> ILinkedList = new SimpleLinkedList<>();
        ILinkedList.insertFirst(1);
        ILinkedList.insertFirst(2);
        ILinkedList.insertFirst(3);
        ILinkedList.insertFirst(4);

        ILinkedList.display();

        for(Integer value: ILinkedList) {
            System.out.println(value);
        }


      */
    }


    private static void displayAll(SimpleLinkedList<Integer> list) {
        // мы не можем применить forach т.к мы не реалезовали extends Iterable<E>
        /*
        for (Integer value : list) {
            System.out.println(value);
        }

         */
    }


}
