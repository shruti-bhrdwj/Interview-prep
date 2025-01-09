package com.shruti.generics;

import java.util.Arrays;

public class CustomGenericAL<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericAL() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[DEFAULT_SIZE * 2];

        //copy elements of previous array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public boolean isFull() {
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
        CustomGenericAL list = new CustomGenericAL();

        list.add("shruti");
        list.add(2);
        list.add(4.5);
        list.add('S');
        list.add(3);
        list.add(4.6);
        list.add(4);
        list.add(4.7);
        list.add(5);
        list.add(4.8);
        System.out.println(list.isFull());
        System.out.println(list.toString());
    }

}