package state;

import visitor.Visitor;

public class Charizard implements State{
	
	Pokemon pokemon;
	
	Charizard(Pokemon pokemon){
		this.pokemon = pokemon;
	}

	@Override
	public void evolve() {
		System.out.println(toString()+" has reached its final stage");
		
	}

	@Override
	public void move() {
		System.out.println(toString()+" used kananlento");
		
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	@Override
	public String toString() {
		return "Charizard";
	}

}
