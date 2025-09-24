package com.programming.singleton;

/**
 * author Amod Kunwar
 */
public class Singleton {

    /*
        1. private static instance
        2. private constructor
        3. public and static getter method
     */

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton object is created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);

        System.out.println(s1 == s2);
    }


}
