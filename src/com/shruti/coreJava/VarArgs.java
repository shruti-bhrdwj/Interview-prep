package com.shruti.coreJava;

import java.util.ArrayList;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fun(2,4,6,8,10);
    fun(2,4,6,8);
    fun(2,4,6);
    multiple(3,4,"abc","abc","fgh");
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
