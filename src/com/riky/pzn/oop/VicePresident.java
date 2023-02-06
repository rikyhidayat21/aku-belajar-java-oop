package com.riky.pzn.oop;

class VicePresident extends Manager {
    void sayHello(String name) {
        System.out.println("Hi " + name + " my name is " + this.name + " as a VP in ...");
    }
}
