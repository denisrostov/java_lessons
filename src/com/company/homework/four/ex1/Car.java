package com.company.homework.four.ex1;

public class Car extends Vehicle {

    private boolean hasCruiseControl;

    public Car(boolean isDirty, double width, double height, double length, boolean hasCruiseControl) {
        super(isDirty, width, height, length);
        this.hasCruiseControl = hasCruiseControl;
    }

}
