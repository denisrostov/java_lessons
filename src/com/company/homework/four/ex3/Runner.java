package com.company.homework.four.ex3;

public class Runner {

    public static void main(String[] args) {

        SoundProducer human = new Human();
        SoundProducer builder = new Builder(human);
        SoundProducer driver = new Driver(human);
        SoundProducer bird = new Bird();

        SoundProducer[] soundProducers = {human, builder, driver, bird};
        for (SoundProducer soundProducer : soundProducers) {
            System.out.println(soundProducer.makeSound());
        }


    }
}
