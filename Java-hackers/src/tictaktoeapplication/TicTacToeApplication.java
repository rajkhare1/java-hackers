package tictaktoeapplication;

import java.util.Scanner;

public class TicTacToeApplication {

	public static void main(String[] args) {
		// Getting input
		Scanner scanner = new Scanner(System.in);
		
		boolean doYouWantToPlay = true;
		
		while(doYouWantToPlay) {
			// Setting up tokens and AI
			System.out.println("Welcome to Tic Tac Toe! You are about to go agianst "
					+ "the master of Tic Tac Toe, Are you ready? I hope so!\n BUT FIRST, "
					+ "you must pick what character you want to be which character I will be");
			System.out.println();
			System.out.println("Enter the single character that represent you on the board");
			char playerToken = scanner.next().charAt(0);
			System.out.println("Enter the single character that represent your opponent on the board");
			char aiToken = scanner.next().charAt(0);
			
			TicTacToe game = new TicTacToe(playerToken, aiToken);
			AI ai = new AI();
			
			// Setup the game
			System.out.println();
			System.out.println("Now you can start the game. To play, Enter your number and your"
					+ "token shall be put in the place.\n The number will go from 1-9, We shall see who"
					+ " will win this round.");
			TicTacToe.printIndexBoard();
			System.out.println();
			
			// Let's play!
			while(game.gameOver().equals("notOver")) {
				if(game.currentMarker == game.userMarker) {
					// USER TURN
					System.out.println("It's your turn! enter your spot for token");
					int spot = scanner.nextInt();
					while(!game.playTurn(spot)) {
						System.out.println("Try again. "+spot+" is invalid. This spot is already taken"
								+ " or it is out of range");
						spot =scanner.nextInt();
					}
					System.out.println("You picked "+spot+"!");
				} else {
					// AI TURN
					System.out.println("It's my turn");
					int aiSpot = ai.pickSpot(game);
					game.playTurn(aiSpot);
					System.out.println("I picked "+aiSpot+"!");
					
				}
				// Print out new board
				System.out.println();
				game.printBoard();
			}
			System.out.println(game.gameOver());
			System.out.println();
			// Set up a new game... or not depending on the response
			System.out.println("Do you want to play again? Enter Y if you do. Enter anything else if"
					+ "you are tired of me.");
			char response = scanner.next().charAt(0); 
			doYouWantToPlay = (response == 'Y');
			System.out.println();
			System.out.println();
			
		}

	}

	
	
	
	
	
	
}
