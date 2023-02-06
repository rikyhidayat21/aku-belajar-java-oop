package com.riky.pzn.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

// IdentityHashMap ini sangat jarang digunakan
public class IdentityHashMapApp {
    public static void main(String[] args) {
        // menggunakan identity hash map, meskipun keynya sama, dia akan berbeda kalau pake identity
        // karena identity hash map itu menggunakan equals reference (==)
//        Map<String, String> map = new IdentityHashMap<>(); // sizenya akan 2
        Map<String, String> map = new HashMap<>(); // sizenya akan 1

        String key1 = "name.first";
        String name = "name";
        String dot = ".";
        String first = "first";
        String key2 = name + dot + first;

        System.out.println(key1.equals(key2)); // true
        System.out.println(key1 == key2); // false

        map.put(key1, "Riky");
        map.put(key2, "Memet");
        System.out.println(map.size());
    }
}
