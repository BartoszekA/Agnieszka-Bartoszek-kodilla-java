package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FindRoute {
    public static void main(String[] args) {
        Set<Flight> flights = FlightFactory.getFlights();

        FindFlight findFlight = new FindFlight(flights);

        findFlight.findFlight("Budapeszt", "Wrocław", "Szczecin");
        findFlight.findFlightFrom("Warszawa");
        findFlight.findFlightTo("Madryt");
    }
}