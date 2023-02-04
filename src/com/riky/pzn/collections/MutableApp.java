package com.riky.pzn.collections;

import com.riky.pzn.collections.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Riky");

        person.addHobby("Game");
        person.addHobby("Read");

//        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Ini harusnya gabisa ditambahin nih");
    }
}
