package com.company.homework.four.ex2;

public class Duck implements Flyable {
    private final boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Утка ранена");
        } else {
            System.out.println("Утка летит");
        }
    }
}
