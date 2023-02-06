package com.riky.pzn.oop;

public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Riky", "Bandung");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Dadang");

        // cara lain inisiate object
        Person person2 = new Person("Memet", "Paten");
//        System.out.println(person2.name);

        // cara lain inisiate object
        Person person3;
        person3 = new Person("Amamiya", "Brothers");

//        System.out.println(person3.name);
    }
}
