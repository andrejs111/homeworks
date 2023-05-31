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
    private static final String file = "C:\\Users\\Andrey\\Desktop\\CODELEX\\Projects\\homeworks\\src\\main\\resources\\collections\\flights.txt";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(file);
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("What would you like to do? ");
            System.out.println("To display the list of cities, press 1. ");
            System.out.println("To exit the program, press #. ");
            String decision = input.nextLine();
            if (decision.equals("1")) {
                System.out.println("List of cities: ");
                findAllCities(path);
                System.out.println("Which city would you like to start from? ");
                String originCity = input.nextLine();
                System.out.println("Which city would you like to go to?");
                String destinationCity = input.nextLine();
                System.out.println("Would you like to go somewhere else? Choose a city or type '#' to exit the program.");


                System.out.println("Your chosen flight(-s) will be: ");
            } else if (decision.equals("#")) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid input.");
            }
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
        System.out.println(cities);
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
        System.out.println(flights);
        return flights;
    }
}

