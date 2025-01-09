package com.shruti.multiThreading;

//Two ways
//extends thread
//implement runnable

/*Runnable is the most preferred technique chosen for defining the threads
because it has the ability to have multiple inheritance. */

//public class Main{
//    public static void main(String[] args)  {
//        Numberloop loop=new Numberloop();
//        loop.start();
//
//    }
//}
//
//class Numberloop extends Thread {
//    //logic
//    public void run() {
//        for(int i=0;i<10;i++) {
//            System.out.println(i);
//        }
//    }
//}

public class Main{
    public static void main(String[] args)  {
        Numberloop loop=new Numberloop();
        Thread t=new Thread(loop);
        t.start();
        //t.start(); starting same object again throw IllegalThreadStateException at runtime

        Thread t2=new Thread(loop);
        t2.start(); //no exception becoz diff object
    }
}

class Numberloop implements Runnable {
    //logic
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(i);
        }
    }
}



