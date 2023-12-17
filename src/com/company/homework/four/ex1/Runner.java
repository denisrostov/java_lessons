package com.company.homework.four.ex1;


import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        List<Vehicle> vehicles = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            vehicles.add(new Car(true, 5, 2, 1.8, true));
        }

        for (int i = 0; i < 5; i++) {
            vehicles.add(new Bus(true, 12, 3, 2.3, 50));
        }

        double totalFee = 0;
        for (Vehicle v : vehicles) {
            totalFee += carWash.wash(v);
        }
        System.out.println("Мэрия заплатит: " + totalFee);
    }
}
