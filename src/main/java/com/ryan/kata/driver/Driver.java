package com.ryan.kata.driver;


public class Driver {
    private String driverName;
    private double totalMilesDriven = 0.0d;

    public Driver(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void addMiles(double milesDriven) {
        totalMilesDriven += milesDriven;
    }

    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }
}
