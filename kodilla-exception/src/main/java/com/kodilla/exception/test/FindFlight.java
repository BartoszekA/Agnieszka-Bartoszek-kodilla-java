package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public static void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Kraków", true);
        flights.put("Warszawa", true);
        flights.put("Poznań", false);

        String airport1 = flight.getDepartureAirport();
        String airport2 = flight.getArrivalAirport();

        if(!flights.containsKey(airport1) || !flights.containsKey(airport2)) {
            throw new RouteNotFoundException();
        }

        if(flights.get(airport1) && flights.get(airport2)) {
            System.out.println("Flight found.");
        } else {
            throw new RouteNotFoundException();
        }
    }
}
