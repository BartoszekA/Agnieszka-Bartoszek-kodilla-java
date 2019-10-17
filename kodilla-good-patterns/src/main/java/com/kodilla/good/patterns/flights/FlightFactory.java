package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightFactory {

    public static Set<Flight> getFlight(){
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("PL01", "Kraków", "Warszawa"));
        flights.add(new Flight("PL02", "Warszawa", "Kraków"));
        flights.add(new Flight("PI01", "Warszawa", "Berlin"));
        flights.add(new Flight("PI02", "Berlin", "Warszawa"));
        flights.add(new Flight("INT01", "Berlin", "Madryt"));
        flights.add(new Flight("INT02", "Madryt", "Berlin"));
        flights.add(new Flight("PL03", "Wrocław", "Szczecin"));
        flights.add(new Flight("PL04", "Szczecin", "Wrocław"));
        flights.add(new Flight("INT03", "Berlin", "Frankfurt"));
        flights.add(new Flight("INT04", "Frankfurt", "Berlin"));

        return flights;
    }
}
