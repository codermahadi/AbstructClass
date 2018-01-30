package com.Mahadi.SimpleExample;

/**
 * Created by Mahadi on 1/30/2018.
 */
public class Rectangle extends Figure{


    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
        int d;
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}
