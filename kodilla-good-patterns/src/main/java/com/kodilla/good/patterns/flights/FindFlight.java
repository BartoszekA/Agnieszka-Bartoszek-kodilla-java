package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FindFlight {
    public static void findDirectFlight(Set<Flight> flights, String fromCity, String toCity)  {

        flights.stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity))
                .filter(f -> f.getArrivalAirport().equals(toCity))
                .forEach(f -> System.out.println(f.getFlightID()));
    }

    public static void findNotDirectFLight(Set<Flight> flights, String fromCity, String toCity) {

        Set<Flight> flightsFrom = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity))
                .collect(Collectors.toSet());

        Set<Flight> flightsTo = flights.stream()
                .filter(f -> f.getArrivalAirport().equals(toCity))
                .collect(Collectors.toSet());

        for(Flight flight1 : flightsFrom) {
            for(Flight flight2 : flightsTo) {
                if(flight2.getDepartureAirport().equals(flight1.getArrivalAirport())) {
                    System.out.println(flight1.getFlightID() + " + " + flight2.getFlightID());
                }
            }
        }

    }
}
