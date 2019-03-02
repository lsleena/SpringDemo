package com.leena.spring.dependsOnAttribute;

public class ClassA {

    // static blank final variable

    static final int i;
    static int b;

    public ClassA() {

        System.out.println("Initializing ClassA");
    }

    // static block

    static {

        System.out.println("in static block");
        i = 5;
        b = i * 5;
        System.out.println("Values " + i + " " +  b);
    }

    public static int getB() {

        return b;
    }
    public static void setB(int b) {

        ClassA.b = b;
    }

    public static int getI() {

        return i;
    }
}