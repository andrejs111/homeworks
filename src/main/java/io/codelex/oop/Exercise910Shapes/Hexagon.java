package io.codelex.oop.Exercise910Shapes;

import java.math.BigDecimal;
import java.util.Objects;

public class Hexagon extends Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;
    protected double sideE;
    protected double sideF;

    public Hexagon(double sideA, double sideB, double sideC, double sideD, double sideE, double sideF) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
        this.sideF = sideF;
    }
    @Override
    double calculatePerimeter() {
       double sum = sideA + sideB + sideC + sideD + sideE + sideF;
       System.out.println("Hexagon perimeter: " + sum);
       return sum;
    }

    @Override
    double calculateArea() {
        double product = (3 * Math.sqrt(3) * Math.pow(sideA, 2)) / 2;   // not mathematically correct
        System.out.printf("Imaginary hexagon area: %.2f", product);
        return product;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getSideE() {
        return sideE;
    }

    public void setSideE(double sideE) {
        this.sideE = sideE;
    }

    public double getSideF() {
        return sideF;
    }

    public void setSideF(double sideF) {
        this.sideF = sideF;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", sideD=" + sideD +
                ", sideE=" + sideE +
                ", sideF=" + sideF +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hexagon hexagon)) return false;
        return Double.compare(hexagon.sideA, sideA) == 0 && Double.compare(hexagon.sideB, sideB) == 0 && Double.compare(hexagon.sideC, sideC) == 0 && Double.compare(hexagon.sideD, sideD) == 0 && Double.compare(hexagon.sideE, sideE) == 0 && Double.compare(hexagon.sideF, sideF) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC, sideD, sideE, sideF);
    }
}
