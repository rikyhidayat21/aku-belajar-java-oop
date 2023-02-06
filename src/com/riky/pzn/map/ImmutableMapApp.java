package com.riky.pzn.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "riky");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "riky") ;
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        // menggunakan Map.of juga akan membuat variable ini immutable
        Map<String, String> map = Map.of(
                "first", "Riky",
                "middle", "Memet",
                "last", "Hidayat"
        );

//        map.put("a", "A"); // error

    }
}
