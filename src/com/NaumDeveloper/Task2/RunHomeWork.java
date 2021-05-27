package com.NaumDeveloper.Task2;


import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class RunHomeWork {

    private static IMyArray <Integer> data1 ;
    private static IMyArray<Integer> data2 ;
    private static IMyArray<Integer> data3 ;

     public static void main(String[] args) {


        data1 = new MyArray<Integer>(4);
        data2 = new MyArray<Integer>(4);
        data3 = new MyArray<Integer>(4);



        addArray(100_000);



        /*
        System.out.println("Array data1");


        // data1.display();


       //  data1.sortBubble();


      //  data1.display();

        System.out.println("Array data2");

       //  data2.display();

       //  data2.sortSelect();

        // data2.display();

        System.out.println("Array data3");

      //   data3.display();


         data3.sortInsert();


     //   data3.display();



         */

         dataTimeSortBubble();
         dataTimeSortSelect();
         dataTimeSortInsert();

    }

    public static void dataTimeSortBubble() {
        Instant start = Instant.now();
        // выполнение какой-то логики
        data1.sortBubble();
        Instant finish = Instant.now();
        double elapsed = Duration.between(start, finish).toMillis();
        System.out.println("SortBulle -> Прошло времени, мс: " + elapsed / 1000 );
    }

    public static void dataTimeSortSelect() {
        Instant start = Instant.now();
        // выполнение какой-то логики
        data2.sortSelect();
        Instant finish = Instant.now();
        double elapsed = Duration.between(start, finish).toMillis();
        System.out.println("SortSelect -> Прошло времени, мс: " + elapsed / 1000);
    }

    public static void dataTimeSortInsert() {
        Instant start = Instant.now();
        // выполнение какой-то логики
        data3.sortInsert();
        Instant finish = Instant.now();
        double elapsed = Duration.between(start, finish).toMillis();
        System.out.println("SortInsert -> Прошло времени, мс: " + elapsed / 1000);
    }

        public static void addArray(int amount){
            Random randomArray = new Random();
            for ( int i = 0; i < amount; i++){
                int random = randomArray.nextInt(9) + 1;
                data1.add(random);
                data2.add(random);
                data3.add(random);

            }

        }

}
