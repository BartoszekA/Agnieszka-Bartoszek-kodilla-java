package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FindFlight {

    private final Set<Flight> flights;

    public FindFlight(Set<Flight> flights) {
        this.flights = flights;
    }

    public Set<Flight> findFlight(String fromCity, String viaCity, String toCity) {

        Set<Flight> foundFlights = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity))
                .filter(f -> f.getChangeAirport().equals(viaCity))
                .filter(f -> f.getArrivalAirport().equals(toCity))
                .collect(Collectors.toSet());

        return foundFlights;
    }

    public Set<Flight> findFlightFrom(String fromCity) {

        Set<Flight> foundFlightsFrom = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity))
                .collect(Collectors.toSet());

        return foundFlightsFrom;
    }

    public Set<Flight> findFlightTo(String toCity) {

        Set<Flight> foundFlightsTo = flights.stream()
                .filter(f -> f.getArrivalAirport().equals(toCity))
                .collect(Collectors.toSet());

        return foundFlightsTo;
    }
}
