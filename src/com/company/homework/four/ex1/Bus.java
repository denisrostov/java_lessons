package com.company.homework.four.ex1;

public class Bus extends Vehicle {

    private int maxPassengers;

    public Bus(boolean isDirty, double width, double height, double length, int maxPassengers) {
        super(isDirty, width, height, length);
        this.maxPassengers = maxPassengers;
    }
}
