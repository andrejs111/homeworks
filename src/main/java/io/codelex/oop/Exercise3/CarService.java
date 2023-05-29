package io.codelex.oop.Exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public static void main(String[] args) {
        CarService carService = new CarService();
        Manufacturer volkswagen = new Manufacturer("Volkswagen", 1950, "Germany");
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 1899, "Germany");

        Car car = new Car("BMW", "X5", 40500, 2020, bmw, EngineType.V6);
        Car car1 = new Car("BMW", "X3", 30000, 2021, List.of(bmw, volkswagen, audi), EngineType.S3);
        Car car2 = new Car("Volkswagen", "Golf", 15000, 2023, volkswagen, EngineType.V12);
        carService.addCar(car);
        carService.addCar(car1);
        carService.addCar(car2);

        // testing the methods here:

        System.out.println("Cars added:");
        for (Car someCar : carService.carList) {
            System.out.printf("%s %s price:%.0f$ year:%d\n", someCar.getName(), someCar.getModel(), someCar.getPrice(), someCar.getYearOfManufacture());
        }
        carService.getV12Cars();
        carService.getCarsProducedBefore(2021);     // I chose year 2023 instead of 1999
        carService.getHighestPrice();
        carService.getCheapestPrice();
        carService.getManufacturers(3);
        carService.getSortedCars("name", true);
        carService.getSortedCars("price", false);
        carService.checkCar(car2);
        carService.getCarsByManufacturer(volkswagen);
        carService.getCarsByManufacturerYear(1916, "=");
    }

    public List<Car> getV12Cars() {
        List<Car> carsWithV12 = new ArrayList<>();
        for (Car someCar : carList) {
            if (someCar.getEngineType() == EngineType.V12) {
                carsWithV12.add(someCar);
            }
        }
        System.out.println(" \n" + "Cars with V12 engine: ");
        for (Car someCar : carsWithV12) {
            System.out.printf("%s %s price:%.0f$ year:%d engine:%s\n", someCar.getName(), someCar.getModel(),
                    someCar.getPrice(), someCar.getYearOfManufacture(), someCar.getEngineType());
        }
        return carsWithV12;
    }

    public List<Car> getCarsProducedBefore(int year) {
        List<Car> carsProducedBeforeYear = new ArrayList<>();
        for (Car someCar : carList) {
            if (someCar.getYearOfManufacture() < year) {
                carsProducedBeforeYear.add(someCar);
            }
        }
        System.out.printf(" \n" + "Cars produced before %d: \n", year);
        for (Car someCar : carsProducedBeforeYear) {
            System.out.printf("%s %s price:%.0f$ year:%d \n", someCar.getName(), someCar.getModel(),
                    someCar.getPrice(), someCar.getYearOfManufacture());
        }
        return carsProducedBeforeYear;
    }

    public Car getHighestPrice() {
        Car highestPriceCar = carList.get(0);
        for (Car someCar : carList) {
            if (someCar.getPrice() > highestPriceCar.getPrice()) {
                highestPriceCar = someCar;
            }
        }
        System.out.println("\nHighest priced car: ");
        System.out.printf("%s %s %.0f\n", carList.get(0).getName(), carList.get(0).getModel(), carList.get(0).getPrice());
        return highestPriceCar;
    }

    public Car getCheapestPrice() {
        Car cheapestPriceCar = carList.get(0);
        for (Car someCar : carList) {
            if (someCar.getPrice() < cheapestPriceCar.getPrice()) {
                cheapestPriceCar = someCar;
            }
        }
        System.out.println("\nCheapest priced car: ");
        System.out.printf("%s %s %.0f\n", carList.get(0).getName(), carList.get(0).getModel(), carList.get(0).getPrice());
        return cheapestPriceCar;
    }

    public Car getManufacturers(int amount) {
        for (Car someCar : carList) {
            if (amount == 1) {
                if (someCar.getManufacturer() != null) {
                    System.out.printf("\nCars with %d manufacturer:\n%s %s %s%n", amount, someCar.getName(), someCar.getModel(), someCar.getManufacturer().getName());
                    return someCar;
                }
            } else if (someCar.getManufacturer() == null && someCar.getManufacturerList().size() == amount) {
                System.out.printf("\nCars with %d manufacturers:\n%s %s %s%n", amount, someCar.getName(), someCar.getModel(), someCar.getManufacturerList());
                return someCar;
            }
        }
        return null;
    }

    public List<Car> getSortedCars(String parameter, boolean ascending) {
        List<Car> sortedCars = new ArrayList<>(carList);
        Comparator<Car> comparator = null;

        switch (parameter) {
            case "name" -> comparator = Comparator.comparing(Car::getName);
            case "model" -> comparator = Comparator.comparing(Car::getModel);
            case "price" -> comparator = Comparator.comparingDouble(Car::getPrice);
            case "yearOfManufacture" -> comparator = Comparator.comparingInt(Car::getYearOfManufacture);
        }

        if (comparator != null) {
            if (ascending) {
                sortedCars.sort(comparator);
            } else {
                sortedCars.sort(comparator.reversed());
            }
        }
        System.out.printf("\nCars sorted by %s:", parameter);
        for (Car someCar : sortedCars) {
            System.out.printf("\n%s %s price:%.0f %d", someCar.getName(), someCar.getModel(), someCar.getPrice(), someCar.getYearOfManufacture());
        }
        System.out.println();
        return sortedCars;
    }

    public boolean checkCar(Car car) {
        System.out.println("\nChecking if car is on the list...");
        if (carList.contains(car)) {
            System.out.println("This car is on the list.\n");
        } else {
            System.out.println("There is no such car on the list.\n");
        }
        return carList.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturer() != null && car.getManufacturer().equals(manufacturer) && car.getManufacturerList() == null) {
                carsByManufacturer.add(car);
            } else if (car.getManufacturer() == null && car.getManufacturerList() != null) {
                for (Manufacturer carManufacturer : car.getManufacturerList()) {
                    if (carManufacturer.equals(manufacturer)) {
                        carsByManufacturer.add(car);
                        break;
                    }
                }
            }
        }
        System.out.printf("\nCars by %s:\n", manufacturer);
        for (Car car: carsByManufacturer) {
            System.out.printf("%s %s %.0f %d\n", car.getName(), car.getModel(), car.getPrice(),car.getYearOfManufacture());
        }
        return carsByManufacturer;
    }
    public List<Car> getCarsByManufacturerYear(int year, String operator) {
        List<Car> carsByManufacturer = new ArrayList<>();

        for (Car car : carList) {
            Manufacturer carManufacturer = car.getManufacturer();
            if (carManufacturer != null && compareYear(carManufacturer.getYearOfEst(), year, operator)) {
                carsByManufacturer.add(car);
            } else if (car.getManufacturerList() != null) {
                for (Manufacturer multiManufacturer : car.getManufacturerList()) {
                    if (compareYear(multiManufacturer.getYearOfEst(), year, operator)) {
                        carsByManufacturer.add(car);
                        break;
                    }
                }
            }
        }

        System.out.printf("\nCars by Manufacturer (Year of Establishment %s %d):\n", operator, year);
        for (Car car : carsByManufacturer) {
            System.out.printf("%s %s price:%.0f %d\n", car.getName(), car.getModel(), car.getPrice(), car.getYearOfManufacture());
        }

        return carsByManufacturer;
    }

    private boolean compareYear(int carYear, int targetYear, String operator) {
        switch (operator) {
            case "<":
                return carYear < targetYear;
            case ">":
                return carYear > targetYear;
            case "<=":
                return carYear <= targetYear;
            case ">=":
                return carYear >= targetYear;
            case "=", "==":
                return carYear == targetYear;
            case "!=":
                return carYear != targetYear;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}


