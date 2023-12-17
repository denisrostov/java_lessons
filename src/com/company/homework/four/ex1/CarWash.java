package com.company.homework.four.ex1;

public class CarWash {

    public double wash(Vehicle vehicle) {
        vehicle.setIsDirty(false);
        return vehicle.isLarge() ? 4000 : 2000;
    }
}
