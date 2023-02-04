package com.riky.pzn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> emptyList = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Riky");
        mutable.add("Hidayat");
        List<String> immutable = Collections.unmodifiableList(mutable);

        System.out.println(immutable);

        List<String> elements = List.of("Riky", "Hidayat"); // immutable list
        elements.add("Gabisa sih harusnya");
    }
}
