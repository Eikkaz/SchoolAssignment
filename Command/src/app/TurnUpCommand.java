package app;

public class TurnUpCommand implements Command {
	
	private Screen scr;
	
	public TurnUpCommand(Screen scr) {
		this.scr = scr;
	}

	@Override
	public void excecute() {
		scr.turnUp();
		
	}

}
