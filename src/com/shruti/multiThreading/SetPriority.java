package com.shruti.multiThreading;

class NumberloopOdd extends Thread {

    public void run(){
        odd();
    }
    public void odd() {
        for(int i=1;i<10;i=i+2) {
            System.out.println("Odd " +i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class NumberloopEven extends Thread {
    public void run() {
        even();
    }
    public void even()  {
        for(int i=2;i<10;i=i+2) {
            System.out.println("Even "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class SetPriority{
    public static void main(String[] args)  {

        NumberloopOdd odd=new NumberloopOdd();
        NumberloopEven even=new NumberloopEven();
        odd.setPriority(6);
        even.setPriority(1);

        even.start();
        odd.start();

    }
}
