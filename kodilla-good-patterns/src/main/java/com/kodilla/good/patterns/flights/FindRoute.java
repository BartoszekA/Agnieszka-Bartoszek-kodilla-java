package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FindRoute {
    public static void main(String[] args) {

        Set<Flight> flights = FlightFactory.getFlight();
        FindFlight.findDirectFlight(flights, "Warszawa", "Madryt");
        FindFlight.findNotDirectFLight(flights, "Warszawa", "Madryt");

    }
}
