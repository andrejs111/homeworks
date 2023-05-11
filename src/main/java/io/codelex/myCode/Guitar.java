package io.codelex.myCode;

public class Guitar {
    private final String brand;
    private final int numberOfStrings;
    private final int year;
    private final String type;
    private String owner;

    public Guitar(String brand, int numberOfStrings, int year, String type) {
        this.brand = brand;
        this.numberOfStrings = numberOfStrings;
        this.year = year;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "brand='" + brand + '\'' +
                ", numberOfStrings=" + numberOfStrings +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}



