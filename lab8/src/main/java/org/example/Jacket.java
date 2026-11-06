package org.example;
public class Jacket extends Clothing {
    private String material;

    public Jacket(String brand, String size, String color, String material) {
        super(brand, size, color);
        this.material = material;
    }

    @Override
    public String getSeason() {
        return "осень/зима";
    }

    public void zipUp() {
        System.out.println("куртка застёгнута на молнию.");
    }

    @Override
    public void displayInfo() {
        System.out.println("куртка");
        super.displayInfo();
        System.out.println("материал: " + material);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}