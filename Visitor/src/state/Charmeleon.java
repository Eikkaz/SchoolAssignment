package state;

import visitor.Visitor;

public class Charmeleon implements State{
	
	Pokemon pokemon;
	
	Charmeleon(Pokemon pokemon){
		this.pokemon = pokemon;
	}

	@Override
	public void evolve() {
		pokemon.setState(new Charizard(pokemon));
		
	}

	@Override
	public void move() {
		System.out.println(toString()+" used broiler");
		
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	@Override
	public String toString() {
		return "Charmeleon";
	}

}
