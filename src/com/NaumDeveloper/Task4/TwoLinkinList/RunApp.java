package com.NaumDeveloper.Task4.TwoLinkinList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RunApp {

    public static void main(String[] args) {
     //  testSimpleLinkedList();
     // testTwoLinkedList();
    testForEach();
    }


    private static void testTwoLinkedList(){
        ITwoLinkedList<Integer> TwoLinkedList = new MyTwoLinkedList<>();
        TwoLinkedList.insertFirst(11);
        TwoLinkedList.insertFirst(2);
        TwoLinkedList.insertFirst(3);
        TwoLinkedList.insertFirst(4);
        TwoLinkedList.insertFirst(0);

        TwoLinkedList.display();
//

        //Вставляем (добовляеи) элемент в конец списка
        TwoLinkedList.insertLast(10);
//
        TwoLinkedList.display();
//
        System.out.println("Find 2: " + TwoLinkedList.contains(2));
        System.out.println("Find 1: " + TwoLinkedList.contains(1));
        System.out.println("Find 4: " + TwoLinkedList.contains(4));
        System.out.println("Find 4444: " + TwoLinkedList.contains(4444));
//
//

// Deleting элемент в начале списка
      TwoLinkedList.removeFirst();
      TwoLinkedList.remove(2);

       TwoLinkedList.display();
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
        System.out.println("----");
//
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }


//

    }
}
