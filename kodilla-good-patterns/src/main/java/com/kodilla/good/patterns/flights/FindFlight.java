package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FindFlight {
    public static Set<Flight> findFlight(Set<Flight> flights, String fromCity, String viaCity, String toCity)  {

        Set<Flight> foundFlights = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity))
                .filter(f -> f.getChangeAirport().equals(viaCity))
                .filter(f -> f.getArrivalAirport().equals(toCity))
                .collect(Collectors.toSet());

        return foundFlights;
    }

    public static Set<Flight> findFlightFrom(Set<Flight> flights, String fromCity) {

        Set<Flight> foundFlightsFrom = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity))
                .collect(Collectors.toSet());

        return foundFlightsFrom;
    }

    public static Set<Flight> findFlightTo(Set<Flight> flights, String toCity) {

        Set<Flight> foundFlightsTo = flights.stream()
                .filter(f -> f.getArrivalAirport().equals(toCity))
                .collect(Collectors.toSet());

        return foundFlightsTo;
    }
}
