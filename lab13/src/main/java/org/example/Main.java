package org.example;

public class Main {
    public static void main(String[] args) {
        GameStore store = new GameStore();
        Game g1 = null;

        try {
            g1 = new Game("dota 2", "moba", 8.5, 0.0, 2013);
            Game g2 = new Game("cs2", "шутер", 9.0, 45.0, 2023);
            Game g3 = new Game("ведьмак 3", "rpg", 9.8, 60.0, 2015);

            store.addgame(g1);
            store.addgame(g2);
            store.addgame(g3);

            g2.updateprice(39.99);
        } catch (InvalidGameDataException e) {
            System.err.println("ошибка валидации: " + e.getMessage());
        } finally {
            System.out.println("инициализация каталога магазина завершена");
        }

        System.out.println();

        try {
            if (g1 != null) {
                g1.updateprice(-50.0);
            }
        } catch (InvalidGameDataException e) {
            System.err.println("поймано исключение: " + e.getMessage());
        }

        System.out.println();

        try {
            store.buygame("cs2");
        } catch (GameNotFoundException | PurchaseException e) {
            System.err.println("ошибка при оформлении заказа: " + e.getMessage());
        } finally {
            System.out.println("проверка операции с cs2 завершена");
        }

        System.out.println();

        try {
            store.buygame("dota 2");
        } catch (GameNotFoundException | PurchaseException e) {
            System.err.println("поймано исключение: " + e.getMessage());
        }

        System.out.println();

        try {
            store.buygame("gta 6");
        } catch (GameNotFoundException | PurchaseException e) {
            System.err.println("поймано исключение: " + e.getMessage());
        }
    }
}