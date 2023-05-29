package io.codelex.oop.Exercise78Computers;

import java.util.Objects;

public class Laptop extends Computer{

    private String battery;

    public Laptop(String CPU, String GPU, String RAM, String company, String model, String battery) {
        super(CPU, GPU, RAM, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        System.out.println(battery);
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery='" + battery + '\'' +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
