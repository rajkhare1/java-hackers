package tictaktoeapplication;

import java.util.ArrayList;
import java.util.Random;

public class AI {

	public int pickSpot(TicTacToe game) {
		ArrayList<Integer> choices = new ArrayList<Integer>();
		for(int i = 0; i < 9; i++) {
			// if slot is not taken, select it as a choice
			
			if(game.board[i] == '-') {
				choices.add(i + 1);
			}
			
		}// ends for
		Random rand = new Random();
		int choice = choices.get(Math.abs(rand.nextInt()% choices.size()));
		return choice;
	}
}
