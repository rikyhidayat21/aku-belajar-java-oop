package com.riky.pzn.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Riky");
        Set<String> mutable = new HashSet<>();
        mutable.add("Hidayat");
        mutable.add("Paten");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Hi", "da", "yat");
//        set.remove("da"); // error
    }
}
