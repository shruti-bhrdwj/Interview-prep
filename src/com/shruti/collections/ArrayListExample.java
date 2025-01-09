package com.shruti.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //initialisation
        ArrayList<Integer> list = new ArrayList<>(6);

        //add elements from input
       for(int i=0;i<6;i++){
           list.add(in.nextInt());
       }

        //check if list has 57 OR NOT
        boolean b = list.contains(57);
        System.out.println(b);

        //set first element i.e. 0th index  to 99
        list.set(0,99);

        //print list
        System.out.println(list);

        //remove first element from list
        list.remove(0);
        System.out.println(list);

        //multi ArrayList
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>(5);

        //initialisation
        for (int i = 0; i < 2; i++) {
            list2.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                list2.get(i).add(in.nextInt());
            }
        }

        System.out.println(list2);

    }
}
