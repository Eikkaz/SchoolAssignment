package visitor;
import state.*;

public class StateVisitor implements Visitor{
	
	public StateVisitor() {
		
	}

	@Override
	public void visit(Charizard Charizard) {
		System.out.println(toString());
		
	}

	@Override
	public void visit(Charmeleon charmeleon) {
		System.out.println(toString());
	}

	@Override
	public void visit(Charmander charmander) {
		System.out.println(toString());
		
	}

}
