package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        shapes.remove(shape);
        boolean result = shapes.contains(shape);
        return result;
    }

    public Shape getFigure(int n) {
        Shape result = shapes.get(n);
        return result;
    }

    public void showFigures() {
        for (Shape shape : shapes) {
            System.out.println(shape.getShapeName());
        }
    }
}
