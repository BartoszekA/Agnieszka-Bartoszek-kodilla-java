package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FindRoute {
    public static void main(String[] args) {

        Set<Flight> flights = FlightFactory.getFlights();
        FindFlight.findFlight(flights, "Budapeszt", "Wrocław", "Szczecin");
        FindFlight.findFlightFrom(flights, "Warszawa");
        FindFlight.findFlightTo(flights, "Madryt");
    }
}