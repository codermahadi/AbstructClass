package com.Mahadi.SimpleExample;

/**
 * Created by Mahadi on 1/30/2018.
 */
public abstract class Figure {

    public double dim1;
    public double dim2;
    public int x = 4;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();

    public void sum(){

    }
}
