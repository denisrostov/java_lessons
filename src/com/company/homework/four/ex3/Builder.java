package com.company.homework.four.ex3;

public class Builder implements SoundProducer {

    private SoundProducer human;

    public Builder(SoundProducer human) {
        this.human = human;
    }

    @Override
    public String makeSound() {
        return "Я строитель." + human.makeSound();
    }
}
