package game.dice.com.dicegameapp.domain;

import java.util.Random;

public class Dice {
	
	private static final int DICE_SIDES=6;
	private int value;

	public Dice() {
		value=5;
	}
	
	public void rollDice() throws Exception {
		value=new Random().nextInt(DICE_SIDES)+1;
		if (value <1 || value >6 )
			throw new Exception("No Correct Dice");
	}
	
	public int getValue() {
		return value;
	}
}
