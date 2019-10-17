package com.kodilla.good.patterns.flights;

public class Flight {
    private String flightID;
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String flightID, String arrivalAirport, String departureAirport) {
        this.flightID = flightID;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getFlightID() {
        return flightID;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (departureAirport != null ? !departureAirport.equals(flight.departureAirport) : flight.departureAirport != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(flight.arrivalAirport) : flight.arrivalAirport != null)
            return false;
        return flightID != null ? flightID.equals(flight.flightID) : flight.flightID == null;
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (flightID != null ? flightID.hashCode() : 0);
        return result;
    }
}
