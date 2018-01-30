package com.Mahadi.SimpleExample;

/**
 * Created by Mahadi on 1/30/2018.
 */
public class Triangle extends Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return dim1 * dim2/2;
    }
}
