package org.example;

import java.util.ArrayList;
import java.util.List;

public class GameStore {
    private List<Game> games = new ArrayList<>();

    public void addgame(Game game) {
        games.add(game);
        System.out.println("игра \"" + game.gettitle() + "\" добавлена в каталог магазина");
    }

    public Game findgame(String title) throws GameNotFoundException {
        for (int i = 0; i < games.size(); i++) {
            Game g = games.get(i);
            if (g.gettitle().equalsIgnoreCase(title)) {
                return g;
            }
        }
        throw new GameNotFoundException("игра \"" + title + "\" не найдена в магазине");
    }

    public void buygame(String title) throws GameNotFoundException, PurchaseException {
        Game game = findgame(title);
        game.purchase();
    }
}