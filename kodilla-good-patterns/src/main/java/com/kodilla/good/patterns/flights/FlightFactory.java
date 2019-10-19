package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightFactory {

    public static Set<Flight> getFlights(){
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("PL01", "Kraków", null, "Warszawa"));
        flights.add(new Flight("PL02", "Warszawa", null, "Kraków"));
        flights.add(new Flight("PI01", "Warszawa", null, "Berlin"));
        flights.add(new Flight("PI02", "Berlin", null,"Warszawa"));
        flights.add(new Flight("INT01", "Berlin", null, "Madryt"));
        flights.add(new Flight("INT02", "Madryt", null, "Berlin"));
        flights.add(new Flight("INT03", "Szczecin", "Wrocław", "Budapeszt"));
        flights.add(new Flight("INT04", "Budapeszt", "Wrocław", "Szczecin"));
        flights.add(new Flight("INT05", "Berlin", "Frankfurt", "Kair"));
        flights.add(new Flight("INT06", "Frankfurt", "Berlin", "Kair"));

        return flights;
    }
}
