package io.codelex.collections.practice.FlightPlanner;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "ytttttttttttttttt6collections\\flights.txt";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(file);
        Scanner input = new Scanner(System.in);
        boolean running = true;
        List<Flight> travel = new ArrayList<>();

        while (running) {
            System.out.println("What would you like to do? ");
            System.out.println("To display the list of cities, press 1. ");
            System.out.println("To exit the program, press #. ");
            String decision = input.nextLine();
            if (decision.equals("1")) {
                System.out.println("List of cities: ");
                Collection<String> allCities = findAllCities(path);
                System.out.println(allCities);

                System.out.println("Which city would you like to start from? ");
                String originCity = input.nextLine();
                List<Flight> allFlights = findAllFlights(path);
                List<String> availableDestinations = findAvailableDestinations(allFlights, originCity);

                System.out.println("Available destinations for " + originCity + ": ");
                System.out.println(availableDestinations);

                System.out.println("Which city would you like to go to?");
                String destinationCity = input.nextLine();

                Flight chosenFlight = findFlight(allFlights, originCity, destinationCity);
                if (chosenFlight != null) {
                    travel.add(chosenFlight);
                    System.out.println("Flight added to travel list.");
                    System.out.println("Your current city: " + destinationCity);
                } else {
                    System.out.println("No direct flight available from " + originCity + " to " + destinationCity);
                }
            } else if (decision.equals("#")) {
                System.out.println("Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid input.");
            }
        }

        System.out.println("Your chosen flights: ");
        for (Flight flight : travel) {
            System.out.println(flight);
        }
    }

    public static Collection<String> findAllCities(Path path) throws IOException {
        Set<String> cities = new HashSet<>();
        for (String line : Files.readAllLines(path, charset)) {
            String[] allCities = line.split(" -> ");
            for (String city : allCities) {
                if (!city.isEmpty()) {
                    cities.add(city);
                }
            }
        }
        return cities;
    }

    public static List<Flight> findAllFlights(Path path) throws IOException {
        List<Flight> flights = new ArrayList<>();
        for (String line : Files.readAllLines(path, charset)) {
            String[] cities = line.split(" -> ");
            if (cities.length == 2) {
                String origin = cities[0];
                String destination = cities[1];
                Flight flight = new Flight(origin, destination);
                flights.add(flight);
            }
        }
        return flights;
    }

    public static List<String> findAvailableDestinations(List<Flight> flights, String originCity) {
        List<String> destinations = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(originCity)) {
                destinations.add(flight.getDestination());
            }
        }
        return destinations;
    }
    public static Flight findFlight(List<Flight> flights, String originCity, String destinationCity) {
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(originCity) && flight.getDestination().equals(destinationCity)) {
                return flight;
            }
        }
        return null;
    }
}

