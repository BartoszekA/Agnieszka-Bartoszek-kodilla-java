package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public String getShapeName() {
        return "circle";
    }

    public double getField() {
        return Math.PI * r * r;
    }
}
