package com.riky.kunal.oop.properties.inheritence;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4, 2.2, 5);
        System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 7);
        System.out.println(box3.h + " " + box3.weight);
    }
}
