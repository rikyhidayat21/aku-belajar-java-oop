package com.riky.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();

        // add data
        strings.add("Riky");
        strings.add("Memet");
        strings.add("CTO");

        // mengubah data
        strings.set(1, "Hidayat");

        // menghapus data
        strings.remove(0);

        // mendapatkan data
        System.out.println(strings.get(0));

        for (var str : strings) {
            System.out.println(str);
        }
    }
}
