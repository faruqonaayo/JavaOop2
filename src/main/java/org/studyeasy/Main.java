package org.studyeasy;

import org.studyeasy.vehicles.Bike;
import org.studyeasy.vehicles.Car;
import org.studyeasy.vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Petrol", 3, 1, 4, "LED", "Short");

        Car car = new Car();
        Truck truck = new Truck("Diesel", 6, 2, 20, "LED", "Power Steering", "Sony Audio System", "Auto AC", 20);


        System.out.println(bike.run());

        System.out.println(car.toString());

        System.out.println(truck.toString());

        System.out.println(truck.run());
    }
}