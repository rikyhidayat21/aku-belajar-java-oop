package com.riky.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // menambahkan data ke collection 1 per 1
        collection.add("Riky");
        collection.add("Hidayat");

        // menambahkan data sekaligus ke collection, bisa pakai method addAll, kemudian diberikan params => Arrays.asList(params) atau List.of(Params)
        collection.addAll(List.of("In", "Memet"));
        collection.addAll(Arrays.asList("We", "Trust"));

        // menampilkan data
        for (var col : collection) {
            System.out.println(col);
        }

        System.out.println("REMOVE DATA");

        // menghapus data
        collection.remove("Trust");
        collection.removeAll(List.of("We", "In"));
        for (var col : collection) {
            System.out.println(col);
        }

        System.out.println("MENGECEK DATA DI COLLECTION");
        // mengecek data di collection

        System.out.println(
                collection.contains("Riky")
        );

        if (collection.containsAll(List.of("Hidayat", "Memet"))) {
            System.out.println("Collection is containts Hidayat and Memet");
        }
    }
}
