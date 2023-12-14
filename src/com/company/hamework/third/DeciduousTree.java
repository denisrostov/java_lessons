package com.company.hamework.third;

public class DeciduousTree extends Tree {

    private boolean hasLeaves;

    public DeciduousTree(int age, boolean hasLeaves) {
        super(age);
        this.hasLeaves = hasLeaves;
    }

    public void flower() {
        this.hasLeaves = true;
        System.out.println("Аллергены полетели");
    }

    public void shedLeaves() {
        this.hasLeaves = false;
    }

    public boolean hasLeaves() {
        return hasLeaves;
    }
}