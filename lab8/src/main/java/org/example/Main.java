package org.example;
public class Main {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("The North Face", "L", "Чёрный", "Мембрана / GORE-TEX");
        TShirt tshirt = new TShirt("Nike", "M", "Белый", "Логотип Swoosh");

        jacket.displayInfo();
        jacket.zipUp();

        System.out.println();

        tshirt.displayInfo();
        tshirt.iron();

    }
}