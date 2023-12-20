package com.company.homework.four.ex1;

public class Car extends Vehicle {

    private boolean hasCruiseControl;

    public Car(boolean isDirty, double length, double height, double width, boolean hasCruiseControl) {
        super(isDirty, length, height, width);
        this.hasCruiseControl = hasCruiseControl;
    }

}
