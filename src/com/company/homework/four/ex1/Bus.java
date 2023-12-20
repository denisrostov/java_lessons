package com.company.homework.four.ex1;

public class Bus extends Vehicle {

    private int maxPassengers;

    public Bus(boolean isDirty, double length, double height, double width, int maxPassengers) {
        super(isDirty, length, height, width);
        this.maxPassengers = maxPassengers;
    }
}
