package com.company.homework.four.ex2;

public class Runner {

    public static void main(String[] args) {

        Duck duck = new Duck(false);
        Duck duck1 = new Duck(true);
        Plane plane = new Plane(10);
        Plane plane1 = new Plane(-1);
        Flyable[] flyables = {duck, duck1, plane, plane1};
        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
