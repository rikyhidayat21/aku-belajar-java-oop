package com.riky.pzn.oop;

class Person {
    String name;
    String address;
    final String country = "Indonesia";

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name);
    }
}
