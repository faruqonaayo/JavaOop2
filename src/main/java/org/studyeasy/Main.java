package org.studyeasy;

import org.studyeasy.vehicles.Bike;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Petrol", 3, 1, 4, "LED", "Short");

        System.out.println(bike.toString());
    }
}