
public class Charmeleon implements PokemonState {
	
	public Charmeleon() {
		
	}

	@Override
	public void evolve(Pokemon pokemon) {
		pokemon.nextState(new Charizard());

	}

	@Override
	public void move1() {
		System.out.println(toString()+" used firewall!!");

	}

	@Override
	public void move2() {
		System.out.println(toString()+" used headbutt");

	}

	@Override
	public void move3() {
		System.out.println(toString()+" used sleep");

	}
	
	@Override
	public String toString() {
		return "Charmeleon";
	}

}
