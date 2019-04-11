package app;

public class Director extends Handler{
	
	private final double MAX = 0.05;
	
	public Director() {
		
	}

	@Override
	public void processRaise(RaiseRequest request) {
		if(request.getRaise()<MAX) {
			System.out.println("Director will approve "+ request.getRaise() + " percent raise");
		}
		else {
			super.processRaise(request);
		}
	}
	
	@Override
	public void setSuccessor(Handler successor) {
		super.setSuccessor(successor);
	}

}
