package com.riky.kunal.oop.properties.inheritence;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this? -> call the parent class constructor
        // used to initialize values present in parent class
        // we cannot access those member of class parent, if in the class parent declared as private
        this.weight = weight;
    }
}
