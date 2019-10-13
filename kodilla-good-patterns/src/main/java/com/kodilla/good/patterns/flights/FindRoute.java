package com.kodilla.good.patterns.flights;

public class FindRoute {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight f1 = new Flight("Warszawa", "Rzeszów");

        try {
            FindFlight.findFlight(f1);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found.");
        }
    }
}
