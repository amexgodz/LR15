package org.example;
public class Main {
    public static void main(String[] args) {
        Clothing basicClothing = new Clothing("Mark Formele", "L", "Серый");
        Jacket jacket = new Jacket("Stonik", "XL", "Черный");
        TShirt tshirt = new TShirt("Abibas", "M", "Белый");

        System.out.println("обычная одежда (" + basicClothing.getBrand() + ", сезон: " + basicClothing.getSeason() + ") ");
        basicClothing.wear();
        basicClothing.wear("прогулки");
        basicClothing.wear(15);

        System.out.println();

        System.out.println("курточка (" + jacket.getBrand() + ", сезон: " + jacket.getSeason() + ")");
        jacket.wear();
        jacket.wear("похода в горы");
        jacket.wear(-10);

        System.out.println();

        System.out.println("майка (" + tshirt.getBrand() + ", сезон: " + tshirt.getSeason() + ")");
        tshirt.wear();
        tshirt.wear("тренировки");
        tshirt.wear(25);
    }
}