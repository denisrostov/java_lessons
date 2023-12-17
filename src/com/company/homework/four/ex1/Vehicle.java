package com.company.homework.four.ex1;

public abstract class  Vehicle {
    protected double width;
    protected double height;

    protected boolean isDirty;

    protected double length;

    public Vehicle(boolean isDirty, double width, double height, double length) {
        this.isDirty = isDirty;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public boolean isLarge() {
        return length > 6 || height > 2.5 || width > 2;
    }

    public void setIsDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }

}
