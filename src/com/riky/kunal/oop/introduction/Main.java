package com.riky.kunal.oop.introduction;

public class Main {
    public static void main(String[] args) {
        Student riky = new Student(13, "riky", 88.8f);
        System.out.println(riky.rno);
        System.out.println(riky.name);
        System.out.println(riky.marks);
    }
}

// create new class
class Student {
    int rno;
    String name;
    float marks;


    // we need a way to add the values of the above
    // properties object by object

    // creating constructor
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}