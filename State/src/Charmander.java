
public class Charmander implements PokemonState {
	
	public Charmander() {
		
	}

	@Override
	public void evolve(Pokemon pokemon) {
		pokemon.nextState(new Charmeleon());

	}

	@Override
	public void move1() {
		System.out.println(toString()+" used bite!");

	}

	@Override
	public void move2() {
		System.out.println(toString()+" used scratch");

	}

	@Override
	public void move3() {
		System.out.println(toString()+" used fireball");

	}
	
	@Override
	public String toString() {
		return "Charmander";
	}

}
