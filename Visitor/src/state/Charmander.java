package state;

import visitor.Visitor;

public class Charmander implements State{
	
	Pokemon pokemon;
	
	Charmander(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	@Override
	public void evolve() {
		pokemon.setState(new Charmeleon(pokemon));
		
	}

	@Override
	public void move() {
		System.out.println(toString()+" used scratch");
		
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	@Override
	public String toString() {
		return "Charmander";
	}

}
