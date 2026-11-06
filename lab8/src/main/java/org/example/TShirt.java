package org.example;
public class TShirt extends Clothing {
    private String print;

    public TShirt(String brand, String size, String color, String print) {
        super(brand, size, color);
        this.print = print;
    }

    @Override
    public String getSeason() {
        return "весна/лето";
    }

    public void iron() {
        System.out.println("футболка поглажена утюгом.");
    }

    @Override
    public void displayInfo() {
        System.out.println("футболка");
        super.displayInfo();
        System.out.println("принт: " + print);
    }

    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
    }
}