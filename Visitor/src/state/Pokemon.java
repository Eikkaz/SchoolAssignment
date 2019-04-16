package state;

import visitor.Visitor;

public class Pokemon {
	
	private State state;
	
	public Pokemon() {
		state = new Charmander(this);
	}
	
	public void setState(State newState) {
		state = newState;
	}
	
	public void evolve() {
		state.evolve();
	}
	
	public void move() {
		state.move();
	}
	
	public void accept(Visitor visitor) {
		state.accept(visitor);
	}
	
	@Override
	public String toString() {
		return state.toString();
	}

}
