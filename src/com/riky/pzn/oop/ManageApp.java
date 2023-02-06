package com.riky.pzn.oop;

public class ManageApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Riky";
        manager.sayHello("Dadang");

        var vicePresident = new VicePresident();
        vicePresident.name = "Hidayat";
        vicePresident.sayHello("Mark");
    }
}
