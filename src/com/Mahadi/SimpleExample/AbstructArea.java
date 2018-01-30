package com.Mahadi.SimpleExample;

/**
 * Created by Mahadi on 1/30/2018.
 */
public class AbstructArea {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(9, 10);
        Triangle triangle = new Triangle(10,8);
        Figure figRef; // No object is created

        figRef = rectangle;
        System.out.println("Rectangle Area is " + figRef.area());

        figRef = triangle;
        System.out.println("Triangle Area is " + figRef.area());
    }
}
