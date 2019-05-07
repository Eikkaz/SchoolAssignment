package app;

public class CommandMain {

	public static void main(String[] args) {
		Screen scr = new Screen();
		Command up = new TurnUpCommand(scr);
		Command down = new TurnDownCommand(scr);
		WallButton b1 = new WallButton(up);
		WallButton b2 = new WallButton(down);
		
		b1.push();
		b2.push();
		

	}

}
