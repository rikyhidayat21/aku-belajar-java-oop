package com.riky.staticExample;

import java.util.Arrays;

public class InnerClass {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Riky"); // if the class Test is not static, we cannot run this code. Because class Test is dependent on InnerClass
        Test b = new Test("Hid");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

// static cannot implement in outside class
//static class A {
//
//}
