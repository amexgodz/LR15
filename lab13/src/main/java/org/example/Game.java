package org.example;

public class Game {
    private String title;
    private String genre;
    private double rating;
    private double price;
    private int releaseyear;

    public Game(String title, String genre, double rating, double price, int releaseyear) throws InvalidGameDataException {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
        this.releaseyear = releaseyear;
        validate();
    }

    public void validate() throws InvalidGameDataException {
        if (rating < 1 || rating > 10) {
            throw new InvalidGameDataException("некорректный рейтинг: " + rating + " (допустимо от 1 до 10)");
        }
        if (price < 0) {
            throw new InvalidGameDataException("некорректная цена: " + price + " (цена не может быть меньше 0)");
        }
    }

    public void purchase() throws PurchaseException {
        if (price <= 0) {
            throw new PurchaseException("ошибка покупки: игра \"" + title + "\" недоступна для платной покупки");
        }
        System.out.println("покупка игры \"" + title + "\" успешно оформлена на сумму " + price);
    }

    public void updateprice(double newprice) throws InvalidGameDataException {
        if (newprice < 0) {
            throw new InvalidGameDataException("некорректная цена: " + newprice + " меньше нуля");
        }
        this.price = newprice;
        System.out.println("цена игры \"" + title + "\" обновлена: " + newprice);
    }

    public String gettitle() {
        return title;
    }

    public double getprice() {
        return price;
    }

    public double getrating() {
        return rating;
    }
}