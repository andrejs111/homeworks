package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    protected double totalSales;
    protected final double SALE_REWARD = 10;         //one sale is 10$
    protected double commissionRate;
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double totalSales, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }
    public void addSales(double newSales) {
        this.totalSales += newSales;
    }

    public double pay() {
        double bonus = totalSales * SALE_REWARD;
        double payment = super.pay() + (bonus * commissionRate);
        this.totalSales = 0;
        return payment;
    }
}
