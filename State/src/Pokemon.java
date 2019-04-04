
public class Pokemon {
	
	private PokemonState state;
	
	public Pokemon() {
		state = new Charmander();
	}
	
	public void nextState(PokemonState newState) {
		state = newState;
	}
	
	public void evolve() {
		state.evolve(this);
	}
	
	public void move1() {
		state.move1();
	}
	public void move2() {
		state.move2();
	}
	public void move3() {
		state.move3();
	}
	
	@Override
	public String toString() {
		return state.toString();
	}

}
