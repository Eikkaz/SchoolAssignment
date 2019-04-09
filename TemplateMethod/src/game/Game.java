package game;

public abstract class Game {
	
	protected int pCount;
	
	abstract void initializeGame();
	
	abstract void makePlay(int p);
	
	abstract boolean endOfGame();
	
	abstract void printWinner();
	
	public final void playOneGame(int pCount) {
		
		this.pCount = pCount;
		initializeGame();
		int j = 0;
		while (!endOfGame()) {
			makePlay(j);
			j = (j+1) % pCount;
		}
		printWinner();
	}

}
