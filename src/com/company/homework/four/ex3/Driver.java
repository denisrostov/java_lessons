package com.company.homework.four.ex3;

public class Driver implements SoundProducer {

    private SoundProducer human;

    public Driver(SoundProducer human) {
        this.human = human;
    }

    @Override
    public String makeSound() {
        return "Я водитель.";
    }
}
