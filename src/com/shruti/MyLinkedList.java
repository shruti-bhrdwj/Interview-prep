package com.shruti;

public class MyLinkedList<T> {
    private Node<T> head;
    private static int size;


    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size(){
        return size;
    }

    public void add(T data){
        Node<T> new_node = new Node<>(data);
        if(head==null){
            head = new_node;
        }else{
            Node<T> current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = new_node;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }
        return current.data;
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> nums = new MyLinkedList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println("Element at index " + i + ": " + nums.get(i));
        }
        System.out.println("Size: "+ nums.size());
    }

}
