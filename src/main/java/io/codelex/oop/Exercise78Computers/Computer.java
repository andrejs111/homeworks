package io.codelex.oop.Exercise78Computers;

import java.util.Objects;

public abstract class Computer {
    protected String CPU;
    protected String GPU;
    protected String RAM;
    protected String company;
    protected String model;

    public Computer(String CPU, String GPU, String RAM, String company, String model) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.company = company;
        this.model = model;
    }

    public String getCPU() {
        System.out.println(CPU);
        return CPU;
    }

    public void setCPU(String cpu) {
        this.CPU = cpu;
    }

    public String getGPU() {
        System.out.println(GPU);
        return GPU;
    }

    public void setGPU(String gpu) {
        this.GPU = gpu;
    }

    public String getRAM() {
        System.out.println(RAM);
        return RAM;
    }

    public void setRAM(String ram) {
        this.RAM = ram;
    }

    public String getCompany() {
        System.out.println(company);
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        System.out.println(model);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return Objects.equals(CPU, computer.CPU) && Objects.equals(GPU, computer.GPU) && Objects.equals(RAM, computer.RAM) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPU, GPU, RAM, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
