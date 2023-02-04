package com.riky.pzn.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Riky");
        names.add("Hidayat");
        names.add("Memet");
        names.add("Riky");
        names.add("Hidayat");
        names.add("Memet");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
