package com.NaumDeveloper.Task2.hw;

import java.util.ArrayList;
import java.util.Random;

public class RunTestArray {

    private static ArrayList <Integer>myArr;

    public static void main(String[] args) {

        myArr = new ArrayList();

        addArray(150);
        ArrayList<Integer> myArr1 = (ArrayList<Integer>) myArr.clone();
        ArrayList<Integer> myArr2 = (ArrayList<Integer>) myArr.clone();

        myArrayRead(myArr);
        myArrayRead(myArr1);
        myArrayRead(myArr2);


    }

    private static int myRandom(){
        Random randomArray = new Random();
        int random = randomArray.nextInt(9) + 1;
        return random;
    }

    public static ArrayList<Integer> addArray(int amount){
        for ( int i = 0; i < amount; i++){
            myArr.add(myRandom());

        }
        return myArr;
     }

    public static void myArrayRead(ArrayList<Integer> x){
        for(Integer numerot : x){
            System.out.print(numerot);
        }

        System.out.println(" ");


    }
}
