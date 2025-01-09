package com.shruti;

public class MyArrayList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    private void resize() {
        int newCapacity = data.length * 2;
        Object[] newData = new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();

        // Add elements
        myList.add(10);
        myList.add(20);
        myList.add(30);

        // Get and print elements
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }
    }
}

