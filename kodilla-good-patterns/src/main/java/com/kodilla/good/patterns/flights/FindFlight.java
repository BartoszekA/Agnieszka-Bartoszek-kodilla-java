package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FindFlight {
    public static Set<Flight> findFlight(Set<Flight> flights, String fromCity, String viaCity, String toCity)  {

        flights.stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity))
                .filter(f -> f.getChangeAirport().equals(viaCity))
                .filter(f -> f.getArrivalAirport().equals(toCity));

        return flights;
    }

    public static Set<Flight> findFlightFrom(Set<Flight> flights, String fromCity) {

        flights.stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity));

        return flights;
    }

    public static Set<Flight> findFlightTo(Set<Flight> flights, String toCity) {

        flights.stream()
                .filter(f -> f.getArrivalAirport().equals(toCity));

        return flights;
    }
}
