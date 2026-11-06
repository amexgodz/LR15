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

    public String getSeason() {
        return "любой сезон";
    }

    public void displayInfo() {
        System.out.println("бренд: " + brand);
        System.out.println("размер: " + size);
        System.out.println("цвет: " + color);
        System.out.println("сезон: " + getSeason());
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