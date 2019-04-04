
public class Charizard implements PokemonState {
	
	public Charizard() {
		
	}

	@Override
	public void evolve(Pokemon pokemon) {
		System.out.println(toString()+" has reached its final stage");

	}

	@Override
	public void move1() {
		System.out.println(toString()+" used sonicboom");

	}

	@Override
	public void move2() {
		System.out.println(toString()+" used raging fire");

	}

	@Override
	public void move3() {
		System.out.println(toString()+" used fly");

	}
	
	@Override
	public String toString() {
		return "Charizard";
	}

}
