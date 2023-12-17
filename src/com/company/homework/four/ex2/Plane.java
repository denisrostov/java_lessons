package com.company.homework.four.ex2;

public class Plane implements Flyable {
    private final int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Пассажиров в самолете меньше 0");
        } else {
            System.out.println("Самолет летит");
        }
    }
}
