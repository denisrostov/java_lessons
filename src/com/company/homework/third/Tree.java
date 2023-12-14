package com.company.homework.third;

public abstract class Tree {
    protected int age;

    protected Tree(int age) {
        this.age = age;
    }

    protected int getAge() {
        return age;
    }
}