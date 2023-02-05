package com.riky.kunal.oop.staticExample;

public class Main {
    /*
    * @static means -> you can use this thing, without creating an object of the class
    * @main -> is the first thing whenever you run a java program -> main is a mandatory
    * */
    public static void main(String[] args) {
        Human riky = new Human(25, "Riky", 14_000_000, true);
        Human dayat = new Human(35, "Dayat", 44_000_000, true);

        // whenever you want to access the static variable - don't do it via reference variable or the object name
//        System.out.println(riky.population); // don't do this
        // but if you want to access the static variable - use the class name instead

        // IMPORTANT
        // without using any reference variable of the object, we can use the STATIC VARIABLE
        System.out.println(Human.population);

        // we cannot access / use any non static method inside a static method
        // code below will be error since greeting() method is not a static
        // greeting();
    }

    // static method below is not dependent on object, otherwise non-static is dependent on the object
    static void fun() {
//        greeting(); // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instance


        // you cannot access not static stuff without referencing their instances in a static context
        // hence, you referencing it like below
        Main obj = new Main();
        obj.greeting();
    }

    // we know that something which is not static, belongs to an object | belongs to an instance
    void greeting() {
        System.out.println("Hi memet");
    }
}
