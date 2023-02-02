package com.riky.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // static variable is not dependent on single object, but it common to all the object?

    /*
    * From static we cannot use non-static stuff
    * */
    static void message() {
        System.out.println("Hello from static message");
//        System.out.println(this.age); // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        // instance variable
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // in order to access `static` we should use the class name
    }
}
