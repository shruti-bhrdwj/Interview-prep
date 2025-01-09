package com.shruti.generics;

//comparing
public class Student implements Comparable<Student>{
    private int rollNo;
    private float marks;

    public Student(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        return diff;
    }

    public static void main(String[] args) {
        Student shruti = new Student(1,96.50f);
        Student sapna = new Student(2,99.50f);

        if(sapna.compareTo(shruti)>0)
            System.out.println("Sapna has more marks");
         else
            System.out.println("Shruti has more marks");
    }

}
