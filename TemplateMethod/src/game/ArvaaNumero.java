package game;

import java.util.Scanner;

public class ArvaaNumero extends Game {
	
	Scanner s = new Scanner(System.in);
	boolean guess = true;
	private int number = 0;
	private int input = 0;
	private int rounds;
	
	
	@Override
	void initializeGame() {
		rounds = 0;
		
	}

	@Override
	void makePlay(int p) {
		while(rounds<5) {
			if(guess) {
				System.out.println("Arvaa numero");
				number = getRandom(9);
				guess=false;
			}
			if (number != input) {
				System.out.println("Yritä uudestaan");
			}
			input = s.nextInt();

			if(number == input) {
				rounds++;
				System.out.println("Hyvä!!");
			}
			else {
				guess = input == number;
			}
		}
	}

	

	@Override
	boolean endOfGame() {
		while(rounds < 5) {
			return false;
		}
		return true;
	}

	@Override
	void printWinner() {
			System.out.println("Olet voittaja");
	}
	
	private int getRandom(int i) {
		return (int) (Math.random()*i + 1);
	}

}
