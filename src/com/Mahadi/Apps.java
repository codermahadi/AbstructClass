package com.Mahadi;

/**
 * Created by Mahadi on 1/30/2018.
 */
public class Apps {

    public static void main(String[] args) {

        A a = new A() {
            @Override
            void callme() {
                System.out.println("Calling from inner class");
            }
        };

        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
