package com.riky.collections;

import com.riky.collections.data.Person;
import com.riky.collections.data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
//        SortedSet<Person> people = new TreeSet<>(new PersonComparator()); // ascending
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed()); // descending

        people.add(new Person("Riky"));
        people.add(new Person("Hidayat"));
        people.add(new Person("Memet"));

        for (var person : people) {
            System.out.println(person.getName());
        }
    }
}
