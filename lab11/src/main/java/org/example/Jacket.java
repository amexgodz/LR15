package org.example;

public class Jacket extends Clothing {

    public Jacket(String brand, String size, String color) {
        super(brand, size, color);
    }

    @Override
    public String getSeason() {
        return "зима";
    }
}
