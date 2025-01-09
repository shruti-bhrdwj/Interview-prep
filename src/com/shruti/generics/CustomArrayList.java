package com.shruti.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[DEFAULT_SIZE * 2];

        //copy elements of previous array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public boolean isFull(){
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       CustomArrayList customArray = new CustomArrayList();
        customArray.add(4);
        customArray.add(11);
        customArray.add(9);
        customArray.add(18);
        customArray.add(4);
        customArray.set(0,100);
        System.out.println(customArray);
        customArray.get(4);

    }

}
