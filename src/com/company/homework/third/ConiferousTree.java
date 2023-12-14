package com.company.homework.third;

public class ConiferousTree extends Tree {

    private String needleType;

    protected String getNeedleType() {
        return needleType;
    }

    public ConiferousTree(int age, String needleType) {
        super(age);
        this.needleType = needleType;
    }
}