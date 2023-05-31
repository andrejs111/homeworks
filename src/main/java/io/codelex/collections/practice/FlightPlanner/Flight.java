package io.codelex.collections.practice.FlightPlanner;

public class Flight {
    private final String origin;
    private final String destination;

    public Flight(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return origin + " -> " + destination;
    }
}
