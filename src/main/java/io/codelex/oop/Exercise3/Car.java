package io.codelex.oop.Exercise3;
import java.util.List;
import java.util.Objects;

enum EngineType {
        V12, V8, V6, S6, S4, S3;
    }

    public class Car {
        private String name;
        private String model;
        private double price;
        private int yearOfManufacture;
        private List<Manufacturer> manufacturerList;
        private EngineType engineType;
        private Manufacturer manufacturer;

        public Car(String name, String model, double price, int yearOfManufacture,
                   List<Manufacturer> manufacturerList, EngineType engineType) {
            this.name = name;
            this.model = model;
            this.price = price;
            this.yearOfManufacture = yearOfManufacture;
            this.manufacturerList = manufacturerList;
            this.engineType = engineType;
        }
        public Car(String name, String model, double price, int yearOfManufacture,
                   Manufacturer manufacturer, EngineType engineType) {
            this.name = name;
            this.model = model;
            this.price = price;
            this.yearOfManufacture = yearOfManufacture;
            this.manufacturer = manufacturer;
            this.engineType = engineType;
        }

        public Manufacturer getManufacturer() {
            return manufacturer;
        }

        public String getName() {
            return name;
        }

        public String getModel() {
            return model;
        }

        public double getPrice() {
            return price;
        }

        public int getYearOfManufacture() {
            return yearOfManufacture;
        }

        public List<Manufacturer> getManufacturerList() {
            return manufacturerList;
        }

        public EngineType getEngineType() {
            return engineType;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), name, model, price, yearOfManufacture, engineType);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Car other = (Car) obj;
            return super.equals(obj)
                    && Double.compare(other.price, price) == 0
                    && yearOfManufacture == other.yearOfManufacture
                    && Objects.equals(name, other.name)
                    && Objects.equals(model, other.model)
                    && engineType == other.engineType;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", model='" + model + '\'' +
                    ", price=" + price +
                    ", yearOfManufacture=" + yearOfManufacture +
                    ", manufacturerList=" + manufacturerList +
                    ", engineType=" + engineType +
                    ", manufacturer=" + manufacturer +
                    '}';
        }
    }
