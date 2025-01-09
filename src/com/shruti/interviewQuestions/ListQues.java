package com.shruti.interviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListQues {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        System.out.println(onlyOddNumbers(list));


//        //using iterator
//        Iterator itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        //using for loop
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

    }

    //check if list has only odd nums
//    public static boolean onlyOddNumbers(List<Integer> list) {
//        return list
//                .parallelStream() // parallel stream for faster processing
//                .anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
//    }

    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }

}
