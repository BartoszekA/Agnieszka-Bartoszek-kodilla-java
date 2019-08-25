package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            challenge.probablyWillThrowException(2.0, 3.5);
        } catch (Exception e) {
            System.out.println("Problem while reading a file.");
        } finally {
            System.out.println("Job is done.");
        }
    }
}
