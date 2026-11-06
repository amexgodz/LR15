package org.example;

public class Clothing {
    private String brand;
    private String size;
    private String color;

    public Clothing(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public void wear() {
        System.out.println("одеваю");
    }

    public void wear(String occasion) {
        System.out.println("одеваю для " + occasion);
    }

    public void wear(int temperature) {
        System.out.println("одеваю при " + temperature + "°C");
    }

    public String getSeason() {
        return "всесезонная";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
