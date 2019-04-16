package state;

import visitor.Visitor;

public interface State {
	void evolve();
	void move();
	void accept(Visitor visitor);

}
