package com.shruti.collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> ll = new TreeSet<>();
        Set<String> strings = new HashSet<>();

        ll.add(25);
        ll.add(30);
        ll.add(45);
        ll.add(25);
        ll.add(45);
        ll.add(4);

        strings.add("Shruti");
        strings.add("Shruti");
        strings.add("Shruti");
        strings.add("Shruti");

        System.out.println(ll); //[4, 25, 30, 45]

        System.out.println(ll.contains(25)); //true
        ll.remove(30);
        System.out.println( ll.size()); //3

        System.out.println(ll); //[4, 25, 45]
        System.out.println(strings); //[Shruti]

        //set cannot have duplicate elements
    }


}
