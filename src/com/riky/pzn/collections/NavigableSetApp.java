package com.riky.pzn.collections;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Riky", "Hidayat", "Memet", "Ini", "Bos"));

        // reverse the set
        NavigableSet<String> namesReverse = names.descendingSet();

        NavigableSet<String> getNameFromStart = names.headSet("Hidayat", true);
        NavigableSet<String> getNameFromEnd = names.tailSet("Hidayat", true);

        for (var name : namesReverse) {
            System.out.println(name);
        }

        // immutable NavigableSet
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Xixi"); // will return an error
    }
}
