package game.dice.com.dicegameapp.application;

import game.dice.com.dicegameapp.domain.Game;
import game.dice.com.dicegameapp.domain.Dice;

public class GameDTO {

    private int dice1;
    private int dice2;
    private boolean hasWon;


    public GameDTO(Game game) throws Exception {
        if(game==null) throw new Exception();
        this.dice1 = game.getDice1();
        this.dice2 = game.getDice2();
        this.hasWon = game.hasWon();

    }

    public int getDice1() {
        return dice1;
    }
    public int getDice2() {
        return dice2;
    }

    public boolean hasWon() {
        return hasWon;
    }

}
