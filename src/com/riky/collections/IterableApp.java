package com.riky.collections;

import java.util.Iterator;
import java.util.List;

/*
* Iterable is a super class
*
* */

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Riky", "Hid", "Paten");

        for (var name : names) {
            System.out.println(name);
        }

        // before for each exists -> a.k.a this is the internal working of iterable
        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
