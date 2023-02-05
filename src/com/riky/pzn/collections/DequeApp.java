package com.riky.pzn.collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

//        add to the first stack
//        stack.offerFirst("Riky");
//        stack.offerFirst("Memet");
//        stack.offerFirst("Hidayat");

//        add to last stack
        stack.offerLast("Riky");
        stack.offerLast("Memet");
        stack.offerLast("Hidayat");
        stack.offerLast("Paten");
        stack.offerLast("Bismillah");

        System.out.println("STACK - LAST IN LAST OUT");
//        print out stack -> mengambil dari yang paling akhir (FILO)
        System.out.println(stack.pollLast()); // karena ini diambil, maka datanya udah gaada di si stacknya
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack);

        System.out.println("ROTATE ALGORITHM");
        System.out.println(rotate(stack, 0));

        System.out.println("QUEUE - ANTRIAN (FIFO");
//        antrian -> queue -> antrian pasti yang depan dulu yang keluar (FIFO)
        Deque<String> queue = new LinkedList<>();

        queue.offerLast("Aku");
        queue.offerLast("Belajar");
        queue.offerLast("Java");
        queue.offerLast("Collections");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue);
    }

    /*
    * rotate method based on size
    *
    * */
    static Deque<String> rotate(Deque<String> stack, int size) {
        if (size == 0) return stack;

        if (size > 0) {
            for (int i = 0; i < size; i++) {
                rotateToRight(stack);
            }
        } else {
            for (int i = size; i < 0; i++) {
                rotateToLeft(stack);
            }
        }

        return stack;
    };

    static Deque<String> rotateToRight(Deque<String> strings) {
        strings.offerFirst(strings.getLast());
        strings.removeLast();
        return strings;
    };

    static Deque<String> rotateToLeft(Deque<String> strings) {
        strings.offerLast(strings.getFirst());
        strings.removeFirst();
        return strings;
    };

}
