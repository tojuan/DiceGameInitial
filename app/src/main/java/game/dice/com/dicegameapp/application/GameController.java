package game.dice.com.dicegameapp.application;

import java.util.List;
import java.lang.String;

import game.dice.com.dicegameapp.domain.*;


public class GameController {

    private static Player player;


    public GameController() {

    }

    public void createPlayer(String name) {
        this.player = new Player(name);
    }

    public String getPlayerName() {
        return player.getName();
    }


    //ahora con DTO da un objeto no un boolean
    public GameDTO playGame() throws Exception {
        Game game = new Game();
        boolean hasWon = game.playGame();
        player.addGame(game);
        return new GameDTO(game);

    }



    public double getPlayerRanking() {
        List<Game> games = player.getAllGames();

        double wins = 0.0;
        for (Game game : games) {
            if (game.hasWon())
                wins++;
        }
        return wins / games.size();
    }


    public int getDice1() {
        Game game = player.getLastGame();
        return game.getDice1();
    }

    public int getDice2() {
        Game game = player.getLastGame();
        return game.getDice2();
    }




    public String getPlayerToString() {
        String text = "";
        List<Game> games = player.getAllGames();

        for (Game game : games) {
            text += "SUMA: " + game.getSumDices() + " RESULTAT: " + game.hasWon();
        }
        return text;
    }

}
