package app;

public class TurnDownCommand implements Command{
	
private Screen scr;
	
	public TurnDownCommand(Screen scr) {
		this.scr = scr;
	}

	@Override
	public void excecute() {
		scr.turnDown();
		
	}

}
