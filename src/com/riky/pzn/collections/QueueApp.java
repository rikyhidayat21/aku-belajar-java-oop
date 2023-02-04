package com.riky.pzn.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>(); // implement array deque
        Queue<String> queue = new PriorityQueue<>(); // implement priority
//        Queue<String> queue = new LinkedList<>(); // implement linkedlist queue

        queue.add("Riky");
        queue.add("Hidayat");
        queue.add("Memet");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
