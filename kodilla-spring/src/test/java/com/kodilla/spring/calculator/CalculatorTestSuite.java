package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculationsAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(2.0, 3.0);
        //Then
        Assert.assertEquals(5.0, addResult, 0.1);
    }

    @Test
    public void testCalculationsSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double subResult = calculator.sub(16.4, 6.4);
        //Then
        Assert.assertEquals(10.0, subResult, 0.1);
    }

    @Test
    public void testCalculationsMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double mulResult = calculator.mul(2.3, 3.0);
        //Then
        Assert.assertEquals(6.9, mulResult, 0.1);
    }

    @Test
    public void testCalculationsDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double divResult = calculator.div(8.8, 2.2);
        //Then
        Assert.assertEquals(4, divResult, 0.1);
    }
}
