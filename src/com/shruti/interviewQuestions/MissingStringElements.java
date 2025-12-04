package com.shruti.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//find missing elements in an array compare to other array
public class MissingStringElements {
    public static void main(String[] args) {
        List<String> ans = findMissing(new String[]{"Apple", "banana","orange","mango"},new String[]{"Apple", "banana"});
        System.out.println(ans);
    }

    //s1: bigger array
    //s2: small array
    static List<String> findMissing(String[] s1, String[] s2){
        List<String> common = new ArrayList();
        List<String> missing = new ArrayList();
        for (String s:s1) {
            for(String st: s2)
            if(s.equals(st)) common.add(s);
        }

        for(String s: s1){
            Iterator itr = common.listIterator();
            if(!itr.next().equals(s)){
                missing.add(s);
            }
        }

        return missing;
    }
}
