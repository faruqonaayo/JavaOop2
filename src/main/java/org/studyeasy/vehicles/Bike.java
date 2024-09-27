package org.studyeasy.vehicles;

public class Bike extends Vehicle {

    private String handle;

    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public Bike() {
        this.handle = "short";
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String run() {
        return "Bike is running";
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }
}

