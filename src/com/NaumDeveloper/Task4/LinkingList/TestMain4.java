package com.NaumDeveloper.Task4.LinkingList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMain4 {

    public static void main(String[] args) {
       testSimpleLinkedList();

        //testForEach();
    }

    private static void testSimpleLinkedList() {
        ILinkedList<Integer> ILinkedList = new SimpleLinkedList<>();
        ILinkedList.insertFirst(1);
        ILinkedList.insertFirst(2);
        ILinkedList.insertFirst(3);
        ILinkedList.insertFirst(4);


        ILinkedList.display();

        System.out.println("Find 2: " + ILinkedList.contains(2));
        System.out.println("Find 1: " + ILinkedList.contains(1));
        System.out.println("Find 4: " + ILinkedList.contains(4));
        System.out.println("Find 4444: " + ILinkedList.contains(4444));

        ILinkedList.removeFirst();
        ILinkedList.remove(2);

        System.out.println("Find 2: " + ILinkedList.contains(2));

        ILinkedList.display();
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

        // мы не можем применить forach т.к мы не реалезовали extends Iterable<E>
        /*
        for(Integer value: ILinkedList) {
            System.out.println(value);
        }

         */
    }
}
