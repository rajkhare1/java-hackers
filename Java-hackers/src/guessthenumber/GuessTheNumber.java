package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	private int theNumber;
	private int max;
	Scanner scanner = new Scanner(System.in);

	public GuessTheNumber() {
		Random rand = new Random();
		// setTheNumber(Math.abs(rand.nextInt()% (getMax() + 1)));
		setMax(100);
		this.theNumber = Math.abs(rand.nextInt() % (this.max + 1));
	}

	public void play() {
		while (true) {
			int move = scanner.nextInt();
			if (move > theNumber) {
				System.out.println("Your number is too big");
			} else if (move < theNumber) {
				System.out.println("Your number is too small");
			} else {
				System.out.println("YOU GOT IT BRO!");
				break;
			}
		}
	}

	public int getTheNumber() {
		return theNumber;
	}

	public void setTheNumber(int newNumber) {
		this.theNumber = newNumber;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int newMax) {
		this.max = newMax;
	}

	public static void howBigIsMyNumber(int x) {
		if (x >= 0 && x <= 10) {
			System.out.println("Our number is pretty small");
		} else if (x >= 11 && x <= 100) {
			System.out.println("Our number is pretty big");
		} else {
			System.out.println("Our number is out of range");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessTheNumber number = new GuessTheNumber();
		System.out.println("Welcome my game. Try and guess my imposible number. its between 0 and "+number.getMax()+
				" Inclusive. Just type a number to get started");
		number.play();

	}

}
