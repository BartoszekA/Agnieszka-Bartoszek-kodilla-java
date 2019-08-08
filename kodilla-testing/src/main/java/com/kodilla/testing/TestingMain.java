package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // zad. kalkulator

        int result1 = Calculator.add(15,5);
        int result2 = Calculator.substract(15,5);

        if (result1 == 20 && result2 == 10) {
            System.out.println("Kalkulator działa");
        } else {
            System.out.println("Kalkulator nie działa");
        }
    }
}

