package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector shapeCollector;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        shapeCollector = new ShapeCollector();
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape theShape = new Circle(5);
        //When
        shapeCollector.addFigure(theShape);
        //Then
        Assert.assertEquals(theShape.getShapeName(), shapeCollector.getFigure(0).getShapeName());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape theShape = new Square(4);
        Shape theShape2 = new Circle(4);
        shapeCollector.addFigure(theShape);
        shapeCollector.addFigure(theShape2);
        //When
        boolean result = shapeCollector.removeFigure(theShape);
        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(theShape2.getShapeName(), shapeCollector.getFigure(0).getShapeName());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape theShape = new Triangle(2, 3);
        shapeCollector.addFigure(theShape);
        //When
        Shape retrievedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(theShape.getShapeName(), retrievedFigure.getShapeName());
    }
}
