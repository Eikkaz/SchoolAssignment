package visitor;

import state.*;

public class Main {

	public static void main(String[] args) {
		Pokemon poke = new Pokemon();
		Visitor visitor = new StateVisitor();
		
		poke.accept(visitor);
		poke.move();
		poke.evolve();
		poke.accept(visitor);
		poke.move();
		poke.evolve();
		poke.accept(visitor);
		poke.move();
		poke.evolve();

	}

}
