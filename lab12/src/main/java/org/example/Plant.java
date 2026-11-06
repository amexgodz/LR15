package org.example;

public class Plant {
    private String name;
    private int id;
    private double height;

    public Plant(String name, int id, double height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "id=" + id + ", высота=" + height;
    }
}