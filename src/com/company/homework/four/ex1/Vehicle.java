package com.company.homework.four.ex1;

public abstract class Vehicle {
    protected double width;
    protected double height;

    protected boolean isDirty;

    protected double length;

    public boolean isLarge() {
        return length > 6 || height > 2.5 || width > 2;
    }

    public Vehicle(boolean isDirty, double length, double height, double width) {
        this.isDirty = isDirty;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setIsDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }

}
