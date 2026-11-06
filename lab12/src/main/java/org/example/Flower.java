package org.example;

public class Flower extends Plant {
    private String bloomColor;

    public Flower(String name, int id, double height, String bloomColor) {
        super(name, id, height);
        this.bloomColor = bloomColor;
    }

    public String getBloomColor() {
        return bloomColor;
    }

    @Override
    public String toString() {
        return super.toString() + ", цвет=" + bloomColor;
    }
}