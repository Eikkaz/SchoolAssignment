package visitor;
import state.*;

public interface Visitor {
	
	void visit (Charizard Charizard);
	void visit (Charmeleon charmeleon);
	void visit (Charmander charmander);
}
