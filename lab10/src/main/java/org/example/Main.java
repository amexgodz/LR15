package org.example;
public class Main {
    public static void main(String[] args) {
        Jacket jacket1 = new Jacket("stonik", "L", "Gore-Tex");
        Jacket jacket2 = new Jacket("abibas", "M", "Нейлон");
        Jacket jacket3 = new Jacket("zara", "XL", "Кожа");

        TShirt tshirt1 = new TShirt("gallery dept", "M", "Черный");
        TShirt tshirt2 = new TShirt("abibas", "L", "Белый");

        jacket1.wear();
        jacket2.wear();
        jacket3.wear();
        tshirt1.wear();
        tshirt2.wear();

        System.out.println();

        jacket1.wash();
        jacket2.wash();
        jacket3.wash();
        tshirt1.wash();
        tshirt2.wash();
        System.out.println(tshirt2.getSize());
        Washable.gav2();
        tshirt1.gav();
    }
}