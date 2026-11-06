package org.example;

public class TShirt implements Wearable, Washable {
    private String brand;
    private String size;
    private String color;

    public TShirt(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public void wear() {
        System.out.println("майка " + brand + " (цвет: " + color + ", размер: " + size + ") одета");
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void wash() {
        System.out.println("майка " + brand + " (" + color + ") из материала " + getMaterial() + " постирана");
    }

    @Override
    public String getMaterial() {
        return "лён";
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}