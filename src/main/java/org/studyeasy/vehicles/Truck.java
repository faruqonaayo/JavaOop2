package org.studyeasy.vehicles;

public class Truck extends Vehicle {
    private String steering;
    private String audioSystem;
    private String airConditioner;
    private int container;

    public Truck() {
        this.steering = "Power Steering";
        this.audioSystem = "Sony Music System";
        this.airConditioner = "Auto AC";
        this.container = 20;
    }

    public Truck(String engine, int wheels, int seats, int fuelTank, String lights, String steering, String audioSystem, String airConditioner, int container) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.audioSystem = audioSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(String audioSystem) {
        this.audioSystem = audioSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public int getContainer() {
        return container;
    }

    public void setContainer(int container) {
        this.container = container;
    }

    @Override
    public String run() {
        return "Truck is running";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + steering + '\'' +
                ", audioSystem='" + audioSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", container=" + container +
                "} " + super.toString();
    }
}
