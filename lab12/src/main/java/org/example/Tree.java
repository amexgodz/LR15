package org.example;

public class Tree extends Plant {
    private double crownDiameter;

    public Tree(String name, int id, double height, double crownDiameter) {
        super(name, id, height);
        this.crownDiameter = crownDiameter;
    }

    public double getCrownDiameter() {
        return crownDiameter;
    }

    @Override
    public String toString() {
        return super.toString() + ", диаметр кроны=" + crownDiameter;
    }
}