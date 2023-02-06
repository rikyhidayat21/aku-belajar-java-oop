package com.riky.pzn.map;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumHashMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }
    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Riky");
        map.put(Level.STANDARD, "Memet");
        map.put(Level.PREMIUM, "Hidayat");
        map.put(Level.VIP, "Riky Hidayat");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
