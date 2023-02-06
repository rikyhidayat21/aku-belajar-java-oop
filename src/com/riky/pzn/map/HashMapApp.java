package com.riky.pzn.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name.first", "Riky");
        map.put("name.middle", "Memet");
        map.put("name.last", "Hidayat");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
