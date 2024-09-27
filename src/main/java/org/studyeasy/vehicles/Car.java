package org.studyeasy.vehicles;

public class Car extends  Vehicle {
    private String steering;
    private String audioSystem;
    private String airConditioner;
    private String fridge;
    private String videoSystem;

    public Car() {
        this.steering = "Power Steering";
        this.audioSystem = "Sony Music System";
        this.airConditioner = "Auto AC";
        this.fridge = "LG Fridge";
        this.videoSystem = "Sony Video System";
    }

    public Car(String engine, int wheels, int seats, int fuelTank, String lights,String steering, String audioSystem, String airConditioner, String fridge, String videoSystem) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.audioSystem = audioSystem;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.videoSystem = videoSystem;
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

    public String getFridge() {
        return fridge;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public String getVideoSystem() {
        return videoSystem;
    }

    public void setVideoSystem(String videoSystem) {
        this.videoSystem = videoSystem;
    }

    @Override
    public String run() {
        return "Car is running";
    }

    @Override
    public String toString() {
        return "Car{" +
                "steering='" + steering + '\'' +
                ", audioSystem='" + audioSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", fridge='" + fridge + '\'' +
                ", videoSystem='" + videoSystem + '\'' +
                "} " + super.toString();
    }
}
